package com.verizon.tracker.New_Expense_Tracker;


public class UserCrdentials {
	String userName;
	String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserCrdentials() {
		// TODO Auto-generated constructor stub
	}
	
	public UserCrdentials(String userName, String password) {
		
		this.userName = userName;
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserCredntials [userName=" + userName + ", password=" + password + "]";
	}
	
	
}
