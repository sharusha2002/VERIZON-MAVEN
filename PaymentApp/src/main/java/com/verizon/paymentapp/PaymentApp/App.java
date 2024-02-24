package com.verizon.paymentapp.PaymentApp;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		User user = context.getBean("user", User.class);
		UserJdbc userjdbc = context.getBean("userJdbc", UserJdbc.class);
		AccountDetails account = context.getBean("accountDetails", AccountDetails.class);
		AccountDetailsTracker acctracker = context.getBean("accountDetailsTracker", AccountDetailsTracker.class);

		boolean isRunning = true;
		Scanner sc = new Scanner(System.in);
		while (isRunning) {
			System.out.println("Payment application");
			System.out.println("1. Create New User");
			System.out.println("2. Login User");
			System.out.println("3. Add Account details");
			System.out.println("4. Exit the application");
			System.out.println("Enter your choice to perform desired operations: ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				System.out.println("Enter your name");
				String name = sc.nextLine();
				System.out.println("Enter your email");

				String email = sc.nextLine();
				System.out.println("Enter your password");

				String password = sc.nextLine();

				if (userjdbc.createNewUser(new User(name, email, password)) > 0) {
					System.out.println("User registerd Successfully");
				} else {
					System.out.println("USer not able to register");
				}
				break;

			case 2:
				System.out.println("Enter your email: ");
				String loginemail = sc.nextLine();
				System.out.println("Enter your password: ");
				String loginpassword = sc.nextLine();

				boolean isAuthenticated = userjdbc.authenticatedUserOrNot(loginemail, loginpassword);
				if (isAuthenticated) {
					System.out.println("User authenticated successfully");
				} else {
					System.out.println("User not found");
				}

				break;

			case 3:
				System.out.println("Enter your name");
				String username = sc.nextLine();
				System.out.println("Enter deposit amount");
				Float deposit = sc.nextFloat();
				System.out.println("Enter balance amount");
				Float balance = sc.nextFloat();

				if (acctracker.addAccountDetails(new AccountDetails(username, deposit, balance)) > 0) {
					System.out.println("Account details added successfully");
				} else {
					System.out.println("Can't able to update data");
				}
				break;
			case 4:
				isRunning = false;
				System.out.println("Exit the application");
				break;

			default:
				System.out.println("Enter valid choice. Choice not found");
				break;

			}

		}
	}
}
