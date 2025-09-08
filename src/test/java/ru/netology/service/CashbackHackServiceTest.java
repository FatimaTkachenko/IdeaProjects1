package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturn100IfAmount2000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;

        int actual = service.calculateCashback(amount);
        int expected = 100;
        assertEquals(expected, actual);
    }
}