package com.verizon.postgres;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component
public class DbConnect {
	Connection dbConnection;
	JdbcTemplate jdbcTemplate;
	void DbConnect() {
		try {
			Class.forName("org.postgresql.Driver");
			try {
				dbConnection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/student", "postgres", "12345678");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("Database not found");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Driver not found");
		}
	}
	
//	DataSource dataSource;
//	JdbcTemplate jdbcTemplate;
//	
//	@Autowired
//	public void setDataSource(DataSource dataSource) {
//		this.dataSource = dataSource;
//	}
	
	
	
	
}
