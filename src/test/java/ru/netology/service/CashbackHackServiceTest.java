package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void cashbackHackService() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;
        int actual = cashbackHackService.remain(amount);
        int expected = 100;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void cashbackHackServiceZero() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;
        int actual = cashbackHackService.remain(amount);
        int expected = 1000;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void cashbackHackServiceOneThousand() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

}