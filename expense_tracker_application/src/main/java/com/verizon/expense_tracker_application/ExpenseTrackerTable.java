package com.verizon.expense_tracker_application;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class ExpenseTrackerTable {

	private Integer expense_id;
	private String expense_name;
	private String category;
	private Float amount;
	private Date date;
	
	public ExpenseTrackerTable() {
		
	}

	public ExpenseTrackerTable(Integer expense_id, String expense_name, String category, Float amount, Date date) {
		super();
		this.expense_id = expense_id;
		this.expense_name = expense_name;
		this.category = category;
		this.amount = amount;
		this.date = date;
	}

	public Integer getExpense_id() {
		return expense_id;
	}

	public void setExpense_id(Integer expense_id) {
		this.expense_id = expense_id;
	}

	public String getExpense_name() {
		return expense_name;
	}

	public void setExpense_name(String expense_name) {
		this.expense_name = expense_name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "ExpenseTrackerTable [expense_id=" + expense_id + ", expense_name=" + expense_name + ", category="
				+ category + ", amount=" + amount + ", date=" + date + "]";
	}

		
	
	
}
