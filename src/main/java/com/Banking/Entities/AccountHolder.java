package com.Banking.Entities;

import javax.persistence.*;

@Entity
@Table(name = "account_holder")
public class AccountHolder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "holderid", nullable = false)
    private Integer id;

    @Column(name = "firstname", nullable = false, length = 20)
    private String firstname;

    @Column(name = "lastname", nullable = false, length = 20)
    private String lastname;

    @Column(name = "email", nullable = false, length = 20)
    private String email;

    @Column(name = "passcode", nullable = false, length = 20)
    private String passcode;

    @Column(name = "accountnumber", length = 20)
    private String accountnumber;

    @Column(name = "savings_accountnumber", length = 20)
    private String savingsAccountnumber;

    @Column(name = "address", nullable = false, length = 20)
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasscode() {
        return passcode;
    }

    public void setPasscode(String passcode) {
        this.passcode = passcode;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public String getSavingsAccountnumber() {
        return savingsAccountnumber;
    }

    public void setSavingsAccountnumber(String savingsAccountnumber) {
        this.savingsAccountnumber = savingsAccountnumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}