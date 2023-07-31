package com.mycompany.bankobj;

public class BankObj {

    public static void main(String[] args) {
        SavingAccount savingsAccount = new SavingAccount();
        savingsAccount.setBalance(20000000); // 20 million
        double savingInterest = savingsAccount.calculateInterest();

        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setBalance(1000000); // 1 million
        double checkingInterest = checkingAccount.calculateInterest();

        System.out.println("Interest for Savings Account: " + savingInterest);
        System.out.println("Interest for Checking Account: " + checkingInterest);
    }
}
