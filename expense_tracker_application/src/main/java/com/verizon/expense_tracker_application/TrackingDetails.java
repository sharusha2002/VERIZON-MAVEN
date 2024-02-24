package com.verizon.expense_tracker_application;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component
public class TrackingDetails {
	
	DataSource dataSource;
	JdbcTemplate jdbctemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbctemplate = new JdbcTemplate(dataSource);
	}
	
	
	int addNewExpense(ExpenseTrackerTable expensetrackertable) {
		String query = "insert into expense_tracker_table values (?,?,?,?,?)";
		return jdbctemplate.update(query, new Object[] {expensetrackertable.getExpense_id() ,expensetrackertable.getExpense_name(), expensetrackertable.getCategory(), expensetrackertable.getAmount(), expensetrackertable.getDate()});
		
	}
	
	

	

	
}
