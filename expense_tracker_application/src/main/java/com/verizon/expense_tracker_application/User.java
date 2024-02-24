package com.verizon.expense_tracker_application;

import org.springframework.stereotype.Component;

@Component
public class User {
	private Integer user_id;
	private String usermail;
	private String userpassword;
	
	
	public User() {
		
	}


	public User(Integer user_id, String usermail, String userpassword) {
		super();
		this.user_id = user_id;
		this.usermail = usermail;
		this.userpassword = userpassword;
	}


	public Integer getUser_id() {
		return user_id;
	}


	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}


	public String getUsermail() {
		return usermail;
	}


	public void setUsermail(String usermail) {
		this.usermail = usermail;
	}


	public String getUserpassword() {
		return userpassword;
	}


	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}


	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", usermail=" + usermail + ", userpassword=" + userpassword + "]";
	}
	
	

	
		

}
	
	
	
	


