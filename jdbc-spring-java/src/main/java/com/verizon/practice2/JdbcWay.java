package com.verizon.practice2;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class JdbcWay {	
	//initialize the datasource for connection
	DataSource datasource;
	//initialize the jdbctemplate for operations to perform
	JdbcTemplate jdbcTemplate;
	
	
	@Autowired
	public void setDatasource(DataSource datasource) {
		jdbcTemplate = new JdbcTemplate(datasource);
	}
	
	//fetch the count of employeename
	
	Integer getCountOfEmployees() {
		String query = "select count(*) from employee";
		return jdbcTemplate.queryForObject(query, Integer.class);
	}
	
	
	
	

}
