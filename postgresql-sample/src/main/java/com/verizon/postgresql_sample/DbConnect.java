package com.verizon.postgresql_sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class DbConnect {

	Connection dbConnection;
	void DbConnection() {
		try {
			Class.forName("org.postgresql.Driver");
			try {
				dbConnection = DriverManager.getConnection("jdbc://postgresql://localhost:5432/student", "root", "12345678");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("Database not found");
			}
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found");
		}
	}
}
