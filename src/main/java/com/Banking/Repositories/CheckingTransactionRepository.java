package com.Banking.Repositories;

import com.Banking.Entities.CheckingTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckingTransactionRepository extends JpaRepository<CheckingTransaction, Integer> {
}