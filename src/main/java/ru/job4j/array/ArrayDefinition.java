package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[4];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Andrey";
        names[1] = "Ivan";
        names[2] = "Sergei";
        names[3] = "Vitaly";
        System.out.println("Размер массива равен:" + ages.length);
        System.out.println("Размер массива равен:" + surnames.length);
        System.out.println("Размер массива равен:" + prices.length);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
