package ru.job4j.loop;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        do {
            System.out.println("Введите год:");
            year = scanner.nextInt();
        }
        while (year % 4 != 0 || year % 100 == 0);
        System.out.println(year + " - високосный");
    }
}


