package com.verizon.walletapp.WalletApp;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		UserJdbc user = context.getBean("userJdbc", UserJdbc.class);
		TransactionDetails transaction = context.getBean("transactionDetails", TransactionDetails.class);
		WalletDetails walletdetails = context.getBean("walletDetails", WalletDetails.class);
		WalletOperations walletOperations=context.getBean("walletOperations",WalletOperations.class);
		Scanner sc = new Scanner(System.in);
		boolean isLoggedIn = false;

		do {
			System.out.println("Welcome to Axis bank application");
			System.out.println("1. Create New Account");
			System.out.println("2.Log in Account");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.println("Enter user name:");
				String name = sc.nextLine();
				System.out.println("Enter user email");
				String email = sc.nextLine();
				System.out.println("Enter user password");
				String password = sc.nextLine();
				if (user.createUser(new UserCredentials(null, name, email, password)) == 1) {
					System.out.println("Account created Successfully");
				} else {
					System.out.println("User already registered");
				}

				break;

			case 2:

				System.out.println("Enter user name");
				String username = sc.nextLine();
				System.out.println("Enter password");
				String userpassword = sc.nextLine();

				if (user.authenticatedUserOrNot(username, userpassword)) {
					System.out.println("User Logged In Successfully at: " + new java.util.Date().toLocaleString());
					walletOperations.operations();
				} else {
					System.out.println("Invalid user password");
				}
				break;
			}
			System.out.println("Enter true  to continue");
		} while (sc.nextBoolean() == true);
	}

}