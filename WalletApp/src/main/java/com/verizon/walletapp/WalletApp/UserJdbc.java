package com.verizon.walletapp.WalletApp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;


@Component
public class UserJdbc {
	
	DataSource dataSource;
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	int createUser(UserCredentials userCredentials) {
		String query = "insert into user_credentials values(?,?,?,?)";
		return jdbcTemplate.update(query, new Object[] {userCredentials.userid(), userCredentials.username(), userCredentials.useremail(), userCredentials.userpassword()});
	}
	
	public boolean authenticatedUserOrNot(String username, String userpassword) {
	    String query = "select username, userpassword from user_credentials where username=? and userpassword = ?";
	    try {
	        Map<String, Object> result = jdbcTemplate.queryForMap(query, new Object[]{username, userpassword});
	        String returnedUsername = (String) result.get("username");
	        String returnedPassword = (String) result.get("userpassword");

	        return username.equals(returnedUsername) && userpassword.equals(returnedPassword);
	    } catch (Exception e) {
	        // Handle the exception or log it
	        return false;
	    }
	}


	  
	class UserMapper implements RowMapper<UserCredentials> {

		@Override
		public UserCredentials mapRow(ResultSet rs, int rowNum) throws SQLException {
			UserCredentials user = new UserCredentials(rs.getInt("userid"), rs.getString("username"), rs.getString("useremail"), rs.getString("userpassword"));
			return user;
		}

	}

	
	
	

}
