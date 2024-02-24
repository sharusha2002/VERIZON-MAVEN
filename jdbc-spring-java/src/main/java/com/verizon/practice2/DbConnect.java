package com.verizon.practice2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Component;

@Component
public class DbConnect {
	Connection dbConnection;
	Statement statement;

	void DbToConnect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			dbConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedatabase", "root", "");
			
			statement = dbConnection.createStatement();
			System.out.println("Successfully connected to the database");
		} catch (ClassNotFoundException e) {

			System.out.println("Driver not found: " + e.getMessage());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Database not found: " + e.getMessage());
		}

	}
	

	void getAllEmployees() {
		String query = "select * from employee";
		try {
			
			ResultSet resultSet = statement.executeQuery(query);
			while(resultSet.next()) {
				System.out.println("Id: "+resultSet.getInt("id")+", Name: "+resultSet.getString("name")+" ,Location: "+resultSet.getString("location"));
			}
		} catch (SQLException e) {
			System.out.println("Data not fetching" + e.getMessage());
		}

	}

	
	void addNewEmployee(Employee employee) {
		String query = "insert into employee values('" +employee.id()+"', '" +employee.name() +"', '"+employee.location()+"')";
	
		try {
			if(statement.executeUpdate(query) > 0)
				System.out.println("Registered the employee");
		} catch (SQLException e) {
			System.out.println("Issues while inserting : " + e.getMessage());
		}
	}
	
	
	
	
	
}
