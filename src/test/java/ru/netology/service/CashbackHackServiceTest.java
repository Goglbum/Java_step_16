package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void CashbackHackService() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int ammount = 900;
        int actual = cashbackHackService.remain(ammount);
        int expected = 100;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void CashbackHackServiceZero() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int ammount = 0;
        int actual = cashbackHackService.remain(ammount);
        int expected = 1000;
        Assert.assertEquals(actual, expected);
    }

}