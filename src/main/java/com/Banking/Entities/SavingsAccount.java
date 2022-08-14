package com.Banking.Entities;

import javax.persistence.*;

@Entity
@Table(name = "savings_account")
public class SavingsAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "savings_accountnumber", length = 20)
    private String savingsAccountnumber;

    @Column(name = "balance", nullable = false)
    private Integer balance;

    @Column(name = "transfer_id", nullable = false)
    private Integer transferId;

    public String getSavingsAccountnumber() {
        return savingsAccountnumber;
    }

    public void setSavingsAccountnumber(String savingsAccountnumber) {
        this.savingsAccountnumber = savingsAccountnumber;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Integer getTransferId() {
        return transferId;
    }

    public void setTransferId(Integer transferId) {
        this.transferId = transferId;
    }

}