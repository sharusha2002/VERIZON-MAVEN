package com.verizon.tracker.New_Expense_Tracker;

import java.sql.Date;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class ExpenseTracker {

	
	
	Date setDate;
	Date extractDate;
	Float amount;
	String item;
	String category;
	public Date getSetDate() {
		return setDate;
	}
	public void setSetDate(Date setDate) {
		this.setDate = setDate;
	}
	public Date getExtractDate() {
		return extractDate;
	}
	public void setExtractDate(Date extractDate) {
		this.extractDate = extractDate;
	}
	public Float getAmount() {
		return amount;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public ExpenseTracker(Date extractDate, Float amount, String item, String category) {
		
		this.extractDate = extractDate;
		this.amount = amount;
		this.item = item;
		this.category = category;
	}
	public ExpenseTracker() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Expensetracker [extractDate=" + extractDate + ", "
				+ "amount=" + amount + ","
						+ " item=" + item + ", "
								+ "category=" + category + "] \n";
	}
	
	
	
	
}
