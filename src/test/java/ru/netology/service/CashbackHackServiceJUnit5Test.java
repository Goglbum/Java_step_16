package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CashbackHackServiceJUnit5Test {

    @Test
    public void cashbackHackService() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;
        int actual = cashbackHackService.remain(amount);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void cashbackHackServiceZero() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;
        int actual = cashbackHackService.remain(amount);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    public void cashbackHackServiceOneThousand() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

}