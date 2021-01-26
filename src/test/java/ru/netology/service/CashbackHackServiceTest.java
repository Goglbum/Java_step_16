package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void CashbackHackService() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int ammount = 900;
        int actual = cashbackHackService.remain(ammount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test
    public void CashbackHackServiceZero() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int ammount = 0;
        int actual = cashbackHackService.remain(ammount);
        int expected = 1000;
        assertEquals(actual, expected);
    }

}