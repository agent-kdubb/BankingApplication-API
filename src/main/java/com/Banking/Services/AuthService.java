package com.Banking.Services;

import com.Banking.DTOs.AuthResponse;
import com.Banking.DTOs.LoginRequest;
import com.Banking.Exceptions.UnauthorizedException;
import com.Banking.Repositories.AccountHolderRepository;
import com.Banking.Repositories.CheckingsAccountRepository;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.security.NoSuchAlgorithmException;
import java.security.spec.KeySpec;

@Service
public class AuthService {

    @Value("${secrets.salt}")
    private String salt;

    public final AccountHolderRepository accountHolderRepository;

    public final CheckingsAccountRepository checkingsAccountRepository;

    public AuthService(AccountHolderRepository accountHolderRepository, CheckingsAccountRepository checkingsAccountRepository) {
        this.accountHolderRepository = accountHolderRepository;
        this.checkingsAccountRepository = checkingsAccountRepository;
    }

    public AuthResponse login(LoginRequest loginRequest){

        return accountHolderRepository.findByEmailIgnoreCaseAndPassword(loginRequest.getEmail(), generatePassword(loginRequest.getPassword()))
                .map(AuthResponse::new)
                .orElseThrow(UnauthorizedException::new);
    }


    public String generatePassword( String passcode) {
        SecretKeyFactory factory;

        KeySpec keySpec = new PBEKeySpec(passcode.toCharArray(), salt.getBytes(), 65536, 128);

        try {
            factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            byte[] hash = factory.generateSecret(keySpec).getEncoded();
            return Base64.encodeBase64String(hash);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
