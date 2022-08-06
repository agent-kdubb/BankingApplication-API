package com.Banking.Entities;

import javax.persistence.*;

@Entity
@Table(name = "checkings_account")
public class CheckingsAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "accountnumber", length = 20)
    private String accountnumber;

    @Column(name = "balance", nullable = false)
    private Integer balance;

    @Column(name = "transaction_id", nullable = false)
    private Integer transactionId;

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

}