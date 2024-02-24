package com.verizon.walletapp.WalletApp;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component
public class TransactionDetails {

    private Integer transactionid;
    private Integer userid;
    private String transactiontype;
    private Float transactionamount;
    private Date date;
    private Integer transactionparty;

    // Constructors
    public TransactionDetails() {
    }

    public TransactionDetails(Integer transactionid, Integer userid, String transactiontype, Float transactionamount, Date date, Integer transactionparty) {
        this.transactionid = transactionid;
        this.userid = userid;
        this.transactiontype = transactiontype;
        this.transactionamount = transactionamount;
        this.date = date;
        this.transactionparty = transactionparty;
    }

    // Getters and Setters
    public Integer getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(Integer transactionid) {
        this.transactionid = transactionid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getTransactiontype() {
        return transactiontype;
    }

    public void setTransactiontype(String transactiontype) {
        this.transactiontype = transactiontype;
    }

    public Float getTransactionamount() {
        return transactionamount;
    }

    public void setTransactionamount(Float transactionamount) {
        this.transactionamount = transactionamount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getTransactionparty() {
        return transactionparty;
    }

    public void setTransactionparty(Integer transactionparty) {
        this.transactionparty = transactionparty;
    }

    // Override toString method if needed
    @Override
    public String toString() {
        return "TransactionDetails{" +
                "transactionid=" + transactionid +
                ", userid=" + userid +
                ", transactiontype='" + transactiontype + '\'' +
                ", transactionamount=" + transactionamount +
                ", date=" + date +
                ", transactionparty=" + transactionparty +
                '}';
    }
}
