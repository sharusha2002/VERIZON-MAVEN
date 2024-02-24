package com.verizon.hibernateproject2;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Engineer.class).buildSessionFactory();
		Session currentSession = sessionFactory.getCurrentSession();
Scanner sc = new Scanner(System.in);
		try {
			currentSession.beginTransaction();
//			Engineer engineer= new Engineer("Sandhiya", "CSE", "SNS College");
//			currentSession.save(engineer);
			currentSession.createQuery(" from Engineer").getResultList().forEach(System.out::println);
			
//		int idToUpdate = sc.nextInt();
//	Engineer engineerToUpdate = currentSession.get(Engineer.class, idToUpdate);
//		engineerToUpdate.setName("Keerthika");
		
//        currentSession.createQuery("update Engineer set name = 'rashmika', department = 'CSE', collegeName = 'Chennai' where id=" + idToUpdate);
		int idToDelete = sc.nextInt();
		Engineer engineerToDelete = currentSession.get(Engineer.class, idToDelete);
		
		currentSession.delete(engineerToDelete);
		System.out.println("User deleted successfully");
			currentSession.getTransaction().commit();
		}

		finally {
				currentSession.close();
		}
	}
}
