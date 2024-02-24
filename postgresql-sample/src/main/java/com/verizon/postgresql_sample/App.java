package com.verizon.postgresql_sample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		DbConnect dbconnect = context.getBean("dbConnect", DbConnect.class);
		dbconnect.DbConnection();
		System.out.println("Database connected");
	}
}
