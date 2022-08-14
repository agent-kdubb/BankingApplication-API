package com.Banking.Entities;

import javax.persistence.*;

@Entity
@Table(name = "checking_transactions")
public class CheckingTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_id", nullable = false)
    private Integer transactionId;

    @Column(name = "amount", nullable = false)
    private Integer amount;

    @Column(name = "merchant", nullable = false, length = 20)
    private String merchant;

    @Column(name = "date_time", length = 20)
    private String dateTime;

    @Column(name = "status", nullable = false, length = 20)
    private String status;

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}