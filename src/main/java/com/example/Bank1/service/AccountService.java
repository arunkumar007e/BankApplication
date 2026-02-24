package com.example.Bank1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Bank1.model.Account;
import com.example.Bank1.repository.AccountRepository;

@Service
public class AccountService {

    @Autowired
    private AccountRepository repo;

    public Account createAccount(Account acc){
        return repo.save(acc);
    }

    public Account getAccount(int id){
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Account not found"));
    }

    @Transactional
    public String transferMoney(int fromId, int toId, double amount){

        Account sender = repo.findById(fromId)
                .orElseThrow(() -> new RuntimeException("Sender not found"));

        Account receiver = repo.findById(toId)
                .orElseThrow(() -> new RuntimeException("Receiver not found"));

        if(sender.getBalance() < amount){
            throw new RuntimeException("Insufficient balance");
        }

        sender.setBalance(sender.getBalance() - amount);
        receiver.setBalance(receiver.getBalance() + amount);

        repo.save(sender);
        repo.save(receiver);

        return "Transfer successful";
    }
}