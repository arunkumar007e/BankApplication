package com.example.Bank1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Bank1.model.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {
}