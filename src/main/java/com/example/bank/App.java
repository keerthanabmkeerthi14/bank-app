package com.example.bank;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    private double balance = 1000;

    public void deposit(double amount) {
        balance += amount;
        logger.info("Deposited: " + amount);
    }

    public void withdraw(double amount) {

        if (amount > balance) {
            logger.error("Insufficient Balance");
        } else {
            balance -= amount;
            logger.info("Withdrawn: " + amount);
        }
    }

    public double checkBalance() {
        return balance;
    }

    public static void main(String[] args) {

        App account = new App();

        account.deposit(500);

        account.withdraw(300);

        System.out.println("Current Balance: " + account.checkBalance());
    }
}
