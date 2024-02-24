package com.verizon.tracker.New_Expense_Tracker;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	static Date setDate;
	static Date exactDate;
	
	static String runOrStop;
	static Integer choiceOfOperation;

	public static void main(String[] args) {
		System.out.println("Expense Tracker Application");
		Scanner sc = new Scanner(System.in);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		TrackingExpenses trackexp = context.getBean("trackingExpenses", TrackingExpenses.class);
		
		String log;
		String signing;
		
		do {
//			signing=sc.next();
//			if(signing.equalsIgnoreCase("signup"))
			
			System.out.println("You are going to Login");
			System.out.println("Enter 1 for entering the credentials");
		Integer logIn = sc.nextInt();
		sc.nextLine();
		if (logIn.equals(1)) {
			System.out.println("Please enter your username ");
			System.out.println("Please enter your password");
			String userName = sc.nextLine();
			String password = sc.nextLine();
			List<UserCrdentials> listOfUsers = trackexp.retrievingUserCredentilas();
			listOfUsers.forEach(user -> {

				if (user.getUserName().equalsIgnoreCase(userName) && user.getPassword().equalsIgnoreCase(password)) {
					System.out.println("Login successfull at : "+ new java.util.Date().toLocaleString());

					do {

						System.out.println("enter your choice of operation");
						System.out.println("Enter 1 to add new item to table");
						System.out.println("Enter 2 to filter the items based on dates");
						System.out.println("Enter 3 to calculate the total expenses");
						System.out.println("Enter 4 to calculate the expnese by category ");
						choiceOfOperation = sc.nextInt();
						switch (choiceOfOperation) {
						case 1:
							System.out.println("Enter the date amount item category");

							exactDate = setDate.valueOf(sc.next());
							Float amount = sc.nextFloat();
							String item = sc.next();
							String category = sc.next();
							System.out
									.println(trackexp.addExpenses(new ExpenseTracker())
											+ " added successfully");
							break;
						case 2: System.out.println("Filtering the Data Give the Dates 1 and 2");
						Date date1 = setDate.valueOf(sc.next());
						Date date2 = setDate.valueOf(sc.next());
						System.out.println(trackexp.filteringProuctsBasedOnDate(date1, date2));
						break;
						case 3: System.out.println("Displaying the expenses");
						System.out.println(trackexp.priceOfAll());
						break;
						case 4:
							System.out.println("Displaying the expenses by category enter category");
							String priceByCategory=sc.next();
							System.out.println("Expense for "+priceByCategory+" :"+trackexp.priceByCategory(priceByCategory));
					
							

						}
						System.out.println("Enter y to run");
						runOrStop=sc.next();
						
					} while (runOrStop.equalsIgnoreCase("y"));

				}

			});

		} else {
			System.out.println("Please enter a valid option to login");
		}
		System.out.println("You are going to log out");
		System.out.println("Please enter logout");
		log=sc.next();
		}while(!log.equalsIgnoreCase("logout"));
		System.out.println("Logged out successfully at : "+new java.util.Date().toLocaleString());
	}
}
