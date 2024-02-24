package com.verizon.expense_tracker_application;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class DbConnect {
	DataSource dataSource;
	JdbcTemplate jdbctemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbctemplate = new JdbcTemplate(dataSource);
	}

	// registering a new user
	int registerNewUser(User user) {
		String query = "insert into login_details values(?,?,?)";
		return jdbctemplate.update(query, new Object[] {  user.getUser_id(), user.getUsermail(), user.getUserpassword() });
	}

	// check whether user is present or not
	public boolean authenticatedUserOrNot(String username, String password) {

		String query = "select count(*) from login_details where user_email = ? and user_password = ?";

		int count = jdbctemplate.queryForObject(query, new Object[] { username, password}, Integer.class);

		if (count > 0) {
			return true;
		} else {
			return false;
		}

	}

	class UserMapper implements RowMapper<User> {

		@Override
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			User user = new User( rs.getInt("user_id"), rs.getString("user_email"), rs.getString("user_password"));
			return user;
		}

	}

}
