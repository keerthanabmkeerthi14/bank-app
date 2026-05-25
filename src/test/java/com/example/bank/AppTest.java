package com.example.bank;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testDeposit() {

        App account = new App();

        account.deposit(500);

        assertEquals(1500, account.checkBalance(), 0);
    }

    @Test
    public void testWithdraw() {

        App account = new App();

        account.withdraw(200);

        assertEquals(800, account.checkBalance(), 0);
    }
}
