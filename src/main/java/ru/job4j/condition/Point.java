package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(4, 5, 5, 6);
        System.out.println("result (4, 5) to (5, 6) " + result);
        result = Point.distance(15, 8, 19, 12);
        System.out.println("result (15, 8) to (19, 12) " + result);
    }
}
