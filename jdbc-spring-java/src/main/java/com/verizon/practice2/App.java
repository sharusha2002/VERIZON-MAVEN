package com.verizon.practice2;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	DbConnect dbConnect = context.getBean("dbConnect", DbConnect.class);
//    	dbConnect.DbToConnect();
//    	System.out.println("Enter id, name and location");
//    	Integer id = sc.nextInt();
//    	sc.nextLine();
//    	String name=sc.nextLine();
//    	String location = sc.nextLine();
//    dbConnect.addNewEmployee(new Employee(id, name, location));
//dbConnect.getAllEmployees();

//		PrepStatement prep = context.getBean("prepStatement", PrepStatement.class);
//		prep.connectToDb();
//		prep.getAllEmployees();
//
//		System.out.println("Enter id, name and location to add new employees:");
//		Integer id = sc.nextInt();
//		sc.nextLine();
//		String name = sc.nextLine();
//		String location = sc.nextLine();
//
//		prep.addNewEmployees(new Employee(id, name, location));
//		prep.getAllEmployees();
//
//		System.out.println("Enter id,name and location to update");
//		Integer id1 = sc.nextInt();
//		sc.nextLine();
//		String name1 = sc.nextLine();
//		String location1 = sc.nextLine();
//		prep.updateEmployee(new Employee(id1, name1, location1));
//		prep.getAllEmployees();
//		
//		
//		System.out.println("Enter id to delete");
//		Integer idToDelete = sc.nextInt();
//		sc.nextLine();
//		prep.deleteEmployee(new Employee(idToDelete, name, location));
//		prep.getAllEmployees();
		
		
//		JdbcWay jdbcWay = context.getBean("jdbcWay", JdbcWay.class);
//		System.out.println("Total number of employees are: "+jdbcWay.getCountOfEmployees());
		
		StudentConnect stuConnect = context.getBean("studentConnect", StudentConnect.class);
//		System.out.println("Student names in student database are: "+stuConnect.getStudentByName(Student student));
//		stuConnect.getStudentByName();
		System.out.println(stuConnect.getStudentByName());
		System.out.println("---------------------------");
		System.out.println("Enter id to print: ");
		System.out.println(stuConnect.getStudentNamesById(new Scanner(System.in).nextInt()));
		System.out.println("---------------------------");

		System.out.println("Enter id to get student record:");
		System.out.println(stuConnect.getStudentsById(new Scanner(System.in).nextInt()));
		System.out.println("---------------------------");

		System.out.println("Enter id,name, dept and location: ");
		Integer id=sc.nextInt();
		sc.nextLine();
		String name=sc.nextLine();
		String dept=sc.nextLine();
		String location=sc.next();
		System.out.println("---------------------------");

//		System.out.println(stuConnect.registerNewStudent(new Student(id, name,dept,location)));
		if(stuConnect.registerNewStudent(new Student(id, name,dept,location))>0) {
			System.out.println("Student Registered successfully");
		}
		
		else {
			System.out.println("Not able to insert data");
		}
		System.out.println("---------------------------");

		System.out.println("Enter name, dept, location and id to update: ");
		Integer updateid=sc.nextInt();
		sc.nextLine();
		String updatename=sc.nextLine();
		String updatedept=sc.nextLine();
		String updatelocation=sc.nextLine();
		
		
		System.out.println(stuConnect.updateStudentById(new Student(updateid, updatename, updatedept, updatelocation)));
		System.out.println("-------------------");
		System.out.println("Enter id to delete: ");
//		System.out.println(stuConnect.deletebyId(new Scanner(System.in).nextInt()));
		if(stuConnect.deletebyId(new Scanner(System.in).nextInt())>0) {
			System.out.println("Deleted Successfully");
		}
		else {
			System.out.println("Enter valid id");
		}
	}
	}
