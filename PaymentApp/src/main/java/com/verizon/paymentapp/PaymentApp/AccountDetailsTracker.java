package com.verizon.paymentapp.PaymentApp;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class AccountDetailsTracker {

	DataSource dataSource;
	JdbcTemplate jdbctemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbctemplate = new JdbcTemplate(dataSource);
	}
	
	int addAccountDetails(AccountDetails accountdetails) {
		String query = " insert into account_details values(?,?,?)";
		return jdbctemplate.update(query, new Object[] {accountdetails.getName(), accountdetails.getDeposit(), accountdetails.getBalance()});
		
	}

}
