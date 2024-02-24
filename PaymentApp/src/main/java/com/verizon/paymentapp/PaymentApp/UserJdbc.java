package com.verizon.paymentapp.PaymentApp;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class UserJdbc {

	DataSource dataSource;
	JdbcTemplate jdbctemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbctemplate = new JdbcTemplate(dataSource);
	}

	int createNewUser(User user) {
		String query = "insert into user_credentials values(?,?,?)";

		return jdbctemplate.update(query, new Object[] { user.getName(), user.getEmail(), user.getPassword() });

	}

	public boolean authenticatedUserOrNot(String email, String password) {
		String query = "select count(*) from user_credentials where email = ? and password = ?";
		int count = jdbctemplate.queryForObject(query, new Object[] { email, password }, Integer.class);

		if (count > 0) {
			return true;
		} else {
			return false;
		}

	}

	class UserMapper implements RowMapper<User> {

		@Override
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			User user = new User(rs.getString("name"), rs.getString("email"), rs.getString("password"));
			return user;
		}

	}

}
