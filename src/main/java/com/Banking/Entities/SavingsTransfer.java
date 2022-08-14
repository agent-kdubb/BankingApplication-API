package com.Banking.Entities;

import javax.persistence.*;

@Entity
@Table(name = "savings_transfers")
public class SavingsTransfer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transfer_id", nullable = false)
    private Integer transferId;

    @Column(name = "amount", nullable = false)
    private Integer amount;

    @Column(name = "recieving_accountnumber", nullable = false, length = 20)
    private String recievingAccountnumber;

    @Column(name = "date_time", length = 20)
    private String dateTime;

    @Column(name = "status", nullable = false, length = 20)
    private String status;

    public Integer getTransferId() {
        return transferId;
    }

    public void setTransferId(Integer transferId) {
        this.transferId = transferId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getRecievingAccountnumber() {
        return recievingAccountnumber;
    }

    public void setRecievingAccountnumber(String recievingAccountnumber) {
        this.recievingAccountnumber = recievingAccountnumber;
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