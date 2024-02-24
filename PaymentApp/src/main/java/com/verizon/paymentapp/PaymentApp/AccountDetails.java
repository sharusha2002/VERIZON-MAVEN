package com.verizon.paymentapp.PaymentApp;

import org.springframework.stereotype.Component;

@Component
public class AccountDetails {

	private String name;
	private Float deposit;
	private Float balance;

	public AccountDetails() {

	}

	public AccountDetails(String name, Float deposit, Float balance) {
		super();
		this.name = name;
		this.deposit = deposit;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getDeposit() {
		return deposit;
	}

	public void setDeposit(Float deposit) {
		this.deposit = deposit;
	}

	public Float getBalance() {
		return balance;
	}

	public void setBalance(Float balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "AccountDetails [name=" + name + ", deposit=" + deposit + ", balance=" + balance + "]";
	}

}
