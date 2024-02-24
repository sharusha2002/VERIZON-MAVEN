package com.verizon.expense_tracker_application;

import java.util.Date;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	static Date date;
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		DbConnect dbConnect = context.getBean("dbConnect", DbConnect.class);
		User user = context.getBean("user", User.class);
		TrackingDetails tracking = context.getBean("trackingDetails", TrackingDetails.class);
		ExpenseTrackerTable expense = context.getBean("expenseTrackerTable", ExpenseTrackerTable.class);
		Scanner sc = new Scanner(System.in);
				boolean isRunning = true;
		System.out.println("Expense Tracker application");
		while (isRunning) {
			System.out.println("1. Register New User");
			System.out.println("2. Login");
			System.out.println("3. Add New Expense");
			System.out.println("4. Exit");
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				System.out.println("Enter userid: ");
				Integer userid = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter user email: ");
				String useremail = sc.nextLine();
				System.out.println("Enter user password: ");
				String userpassword = sc.nextLine();
				if (dbConnect.registerNewUser(new User(userid, useremail, userpassword)) > 0) {
					System.out.println("User regisered successfull");
				} else {
					System.out.println("User not able to register");
				}
				break;
			case 2:
				System.out.println("Enter your user email login: ");
				String loginemail = sc.nextLine();
				System.out.println("Enter your user password login: ");

				String loginpassword = sc.nextLine();
				boolean isauthenticated = dbConnect.authenticatedUserOrNot(loginemail, loginpassword);
				if (isauthenticated) {
					System.out.println("User authenticated successfully");
				} else {
					System.out.println("User not found");
				}
				break;

			case 3:
				System.out.println("Enter expense id:");
				Integer expense_id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter expense_name: ");
				String expense_name = sc.nextLine();
				System.out.println("Enter category: ");
				String expense_category = sc.nextLine();
				System.out.println("Enter your amount: ");
				Float amount = sc.nextFloat();
				System.out.println("Enter your date: ");
				Date date2 = new Date();			
				if(tracking.addNewExpense(new ExpenseTrackerTable(expense_id,expense_name, expense_category, amount, date2))>0) {
					System.out.println("Expense added successfully");
				}
				break;
			case 4:
				System.out.println("Exit the application");
				isRunning = false;
				break;
			default:
				System.out.println("Enter valid choice, choice not found");
				break;
			}
		}

	}
}
