package ru.job4j.condition;

public class SqArea {
    public static double squarea(double p, double k) {
        double result1 = k + 1;
        double result2 = 2 * result1;
        double resultH = p / result2;
        double resultL = resultH * k;
        return resultL * resultH;
    }

    public static void main(String[] args) {
        double resultA = SqArea.squarea(6, 2);
        System.out.println("p = 6, k = 2, s = 2, real = " + resultA);
    }
}
