package com.verizon.postgres;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	DbConnect dbConnect = context.getBean("dbConnect", DbConnect.class);
//    	dbConnect.DbConnect();
    	System.out.println("Database connected successfully");
    	
    }
}
