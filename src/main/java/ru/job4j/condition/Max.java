package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int third) {
        int tmp = max(right, third);
        return max(left, tmp);

    }

    public static int max(int left, int right, int third, int thirda) {
        return max(left, max(right, third, thirda));
    }

    public static void main(String[] args) {
        System.out.println(max(5, 8));
        System.out.println(max(5, 8, 10));
        System.out.println(max(5, 8, 10, 15));
    }
}
