package com.mycompany.bankobj;

public class SavingAccount extends BankAccount{
    private final double interestRate = 0.12;

    public double calculateInterest() {
        return getBalance() * interestRate;
    }
}
