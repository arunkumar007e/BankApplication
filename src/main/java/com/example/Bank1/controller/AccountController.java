package com.example.Bank1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Bank1.model.Account;
import com.example.Bank1.service.AccountService;

@RestController
@RequestMapping("/account")
@CrossOrigin(origins = "http://localhost:3000")
public class AccountController {

    @Autowired
    private AccountService service;

    @PostMapping
    public Account create(@RequestBody Account acc){
        return service.createAccount(acc);
    }

    @GetMapping("/{id}")
    public Account get(@PathVariable int id){
        return service.getAccount(id);
    }

    @PostMapping("/transfer")
    public String transfer(@RequestParam int fromId,
                           @RequestParam int toId,
                           @RequestParam double amount){
        return service.transferMoney(fromId, toId, amount);
    }
}