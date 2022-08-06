package com.Banking.Repositories;

import com.Banking.Entities.CheckingsAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckingsAccountRepository extends JpaRepository<CheckingsAccount, String> {
}