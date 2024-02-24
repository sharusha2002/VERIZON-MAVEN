package com.verizon.walletapp.WalletApp;

import org.springframework.stereotype.Component;

@Component
public class WalletDetails {

	private Integer walletid;
	private String accountnumber;
	private Integer userid;
	private Float balance;
	private Float threshold;
	
	
	public WalletDetails() {
		
	}


	public WalletDetails(String accountnumber, Integer userid, Float balance, Float threshold) {
		super();
		this.accountnumber = accountnumber;
		this.userid = userid;
		this.balance = balance;
		this.threshold = threshold;
	}


	public Integer getWalletid() {
		return walletid;
	}


	public void setWalletid(Integer walletid) {
		this.walletid = walletid;
	}


	public String getAccountnumber() {
		return accountnumber;
	}


	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}


	public Integer getUserid() {
		return userid;
	}


	public void setUserid(Integer userid) {
		this.userid = userid;
	}


	public Float getBalance() {
		return balance;
	}


	public void setBalance(Float balance) {
		this.balance = balance;
	}


	public Float getThreshold() {
		return threshold;
	}


	public void setThreshold(Float threshold) {
		this.threshold = threshold;
	}


	@Override
	public String toString() {
		return "WalletDetails [walletid=" + walletid + ", accountnumber=" + accountnumber + ", userid=" + userid
				+ ", balance=" + balance + ", threshold=" + threshold + "]";
	}
	
	
}
