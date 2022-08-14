package com.Banking.Repositories;

import com.Banking.Entities.AccountHolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountHolderRepository extends JpaRepository<AccountHolder, Integer> {

    @Query
    Optional<AccountHolder> findByEmailIgnoreCaseAndPassword(String email, String passcode);
}