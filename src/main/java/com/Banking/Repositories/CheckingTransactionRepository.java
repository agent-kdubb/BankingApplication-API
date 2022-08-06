package com.Banking.Repositories;

import com.Banking.Entities.CheckingTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckingTransactionRepository extends JpaRepository<CheckingTransaction, Integer> {
}