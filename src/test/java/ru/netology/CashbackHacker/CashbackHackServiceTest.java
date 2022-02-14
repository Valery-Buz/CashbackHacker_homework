package ru.netology.CashbackHacker;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

class CashbackHackServiceTest {

    @Test
    public void amountUnderTheBorder() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 900;
        int expected = 100;

        int actual = cashbackHackService.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void amountOverTheBorder() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 1500;
        int expected = 500;

        int actual = cashbackHackService.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void amountEqualsBorder() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 1000;
        int expected = 0;

        int actual = cashbackHackService.remain(amount);

        assertEquals(actual, expected);
    }

}