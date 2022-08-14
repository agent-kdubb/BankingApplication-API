package com.Banking.Repositories;

import com.Banking.Entities.SavingsTransfer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SavingsTransferRepository extends JpaRepository<SavingsTransfer, Integer> {
}