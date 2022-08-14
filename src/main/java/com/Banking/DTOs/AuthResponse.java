package com.Banking.DTOs;

import com.Banking.Entities.AccountHolder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class AuthResponse {

    private Integer id;

    private String firstname;

    private String lastname;

    private String email;

    private String passcode;

    public AuthResponse(AccountHolder accountHolder) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.passcode = passcode;
    }
}
