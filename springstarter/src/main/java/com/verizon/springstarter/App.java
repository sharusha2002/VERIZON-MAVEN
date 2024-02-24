package com.verizon.springstarter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	// default way
//	Engineer engineer;
//	App(){
//		this.engineer = new Engineer("sharusha","html, css");
//	}
	public static void main(String[] args) {
//		App app = new App();
//		app.engineer.workForWages();

		// 1. load the context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		// 2. Get a reference to the bean
//		Engineer engineer = context.getBean("theEngineer", Engineer.class);
//		// 3.call methods on the object
//		engineer.workForWages();
//
//		Doctor doctor = context.getBean("theDoctor", Doctor.class);
//		doctor.printDoctor();
		
		CivilEngineer civil = context.getBean("civilEngineer", CivilEngineer.class);
		civil.workForWages();
	}
}
