package ru.netology.service;

public class CashbackHackService {
    private final int limit = 100;

    public int remainder(int amount) {
        return limit - amount % limit;
    }

    public int calculateCashback(int amount) {
        int cashback = amount * 5 / 100;  // 5% кешбэк
        if (cashback > limit) {
            cashback = limit; // лимит кешбэка
        }
        return cashback;
    }
}