package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double resultX = x2 - x1;
        double resultY = y2 - y1;
        double resultPowX = Math.pow(resultX, 2);
        double resultPowY = Math.pow(resultY, 2);
        double sum = resultPowX + resultPowY;
        double result = Math.sqrt(sum);
        return result;
    }

    public static void main(String[] args) {
        double result = Point.distance(4, 5, 5, 6);
        System.out.println("result (4, 5) to (5, 6) " + result);
    }
}
