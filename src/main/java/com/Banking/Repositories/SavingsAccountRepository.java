package com.Banking.Repositories;

import com.Banking.Entities.SavingsAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SavingsAccountRepository extends JpaRepository<SavingsAccount, String> {
}