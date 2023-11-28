package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        money -= price;
        for (int index = 0; money > 0; index++) {
            while (money >= coins[index]) {
                money -= coins[index];
                rsl[size++] = coins[index];
                if (money > coins[0]) {
                    index = 0;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
