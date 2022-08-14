package com.Banking.Repositories;

import com.Banking.Entities.CheckingsAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckingsAccountRepository extends JpaRepository<CheckingsAccount, String> {
}