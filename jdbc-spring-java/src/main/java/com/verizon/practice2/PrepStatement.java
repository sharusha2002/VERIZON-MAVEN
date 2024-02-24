package com.verizon.practice2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class PrepStatement {

	Connection dbConnection;
	PreparedStatement prepStatement;
	public static final String DB_DRIVERNAME = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL ="jdbc:mysql://localhost:3306/employeedatabase";
	public static final String DB_USERNAME="root";
	public static final String DB_PASSWORD="";
	void connectToDb() {
		
			try {
				Class.forName(DB_DRIVERNAME);
				
					dbConnection = DriverManager.getConnection(DB_URL , DB_USERNAME, DB_PASSWORD);
					System.out.println("Database connected");

			} catch (ClassNotFoundException e) {
			System.out.println("Driver not found"+e.getMessage());
			}
			catch (SQLException e) {
				System.out.println("Database not found"+e.getMessage());
			}
	}
	
	
	void getAllEmployees() {
		String query = "select * from employee";
		
		try {
			prepStatement = dbConnection.prepareStatement(query);
			ResultSet resultSet = prepStatement.executeQuery();
			while(resultSet.next()) {
				System.out.println("Id: "+resultSet.getInt("id")+", Name: "+resultSet.getString("name")+", Location: "+resultSet.getString("location"));
			}
		} catch (SQLException e) {
			System.out.println("Error in executing data");
		}
	}
	
	
	
	void addNewEmployees(Employee employee) {
		String query = "insert into employee values(?,?,?)";
		
		try {
			prepStatement = dbConnection.prepareStatement(query);
			prepStatement.setInt(1, employee.id());
			prepStatement.setString(2, employee.name());
			prepStatement.setString(3, employee.location());
			
			if(prepStatement.executeUpdate() >0) {
				System.out.println("Registered employees");
			}
			
		} catch (SQLException e) {
			System.out.println("Error in adding data to database");
		}
		
	}
	
	
	void updateEmployee(Employee employee) {
		String query = "Update employee set name=?, location=? where id=?";
		try {
			prepStatement = dbConnection.prepareStatement(query);
			
			
			prepStatement.setString(1, employee.name());
			prepStatement.setString(2, employee.location());
			prepStatement.setInt(3, employee.id());
			if(prepStatement.executeUpdate()>0) {
				System.out.println("Employee updated successfully");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Cant able to update employee");
		}
	}
	
	void deleteEmployee(Employee employee) {
		String query="Delete from employee where id=?";
		try {
			prepStatement = dbConnection.prepareStatement(query);
			prepStatement.setInt(1, employee.id());
			if(prepStatement.executeUpdate()>0) {
				System.out.println("Row deleted successfully");
			}
			
		} catch (SQLException e) {
			System.out.println("Cant able to delete record");
		}
	}
}
