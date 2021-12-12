package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double resultP = (a + b + c) / 2;
        return Math.sqrt(resultP * (resultP - a) * (resultP - b) * (resultP - c));
    }

    public static void main(String[] args) {
        double result = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + result);
    }
}
