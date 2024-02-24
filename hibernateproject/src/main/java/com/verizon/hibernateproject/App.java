package com.verizon.hibernateproject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Doctor.class).buildSessionFactory();

		Session currentSession = sessionFactory.getCurrentSession();

		try {
			// Using the session to perform Operations here...
			// 1. Create a new Doctor Object
//			Doctor doctor1 = new Doctor("Sharusha", "Cardiologist", "Chennai");

			// 2. begin the transaction
			currentSession.beginTransaction();

			// 3. Save the object
//			currentSession.save(doctor1);

			// 4. Commit the transaction
//			currentSession.getTransaction().commit();

			Doctor readDoctor = currentSession.get(Doctor.class, 1);
//			
			readDoctor.setName("Siva");
			readDoctor.setSpeciality("Neuro");

			readDoctor.setLocation("Madurai");
			
			System.out.println("Your Doctor details are: "+readDoctor);
			currentSession.getTransaction().commit();

		} finally {
			currentSession.close();
		}
	}
}
