package com.example.Bank1.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "Name should not be empty")
    private String accountHolderName;

    @Min(value = 0, message = "Balance cannot be negative")
    private double balance;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getAccountHolderName() { return accountHolderName; }
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }
}