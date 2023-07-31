package com.mycompany.bankobj;

public class CheckingAccount extends BankAccount{
    private final double interestRate = 0.02;

    public double calculateInterest() {
        return getBalance() * interestRate;
    }
}
