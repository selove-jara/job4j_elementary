package ru.job4j.condition;

public class Types {
    public static void main(String[] args) {
        long l = 129;
        byte rsl1 = (byte) l;
        System.out.println("Результат вычисления: " + rsl1);
        float f = 12358.7f;
        int i = 45981;
        short rsl = (short) (f + i);
        System.out.println("Результат вычисления: " + rsl);
        char c = 45000;
        System.out.println("Результат вычисления: " + (float) c);
        double d = 121.19;
        byte rsl3 = (byte) d;
        System.out.println("Результат вычисления: " + rsl3);
        short s = 1500;
        char a = (char) s;
        System.out.println("Результат вычисления: " + (double) a);

    }
}
