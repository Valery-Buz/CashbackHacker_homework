package ru.netology.CashbackHacker;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

class CashbackHackServiceTest {

    @Test
    public static void cashbackRemain() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 900;
        int expected = 100;

        int actual = cashbackHackService.remain(amount);

        assertEquals(actual, expected);
    }
}