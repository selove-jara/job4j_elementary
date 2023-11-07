package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double resultX = x2 - x1;
        double resultY = y2 - y1;
        resultX = Math.pow(resultX, 2);
        resultY = Math.pow(resultY, 2);
        return Math.sqrt(resultX + resultY);
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = Point.distance(2, 1, 3, 4);
        System.out.println("result (2, 1) to (3, 4) " + result);
        result = Point.distance(6, 1, 2, 3);
        System.out.println("result (6, 1) to (2, 3) " + result);
    }
}
