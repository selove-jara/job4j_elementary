package ru.job4j.array;

import java.io.FileOutputStream;
import java.util.Arrays;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        try (FileOutputStream out = new FileOutputStream("result.txt")) {
            for (int row = 0; row < size; row++) {
                for (int cell = 0; cell < size; cell++) {
                    table[row][cell] = (row + 1) * (cell + 1);
                    out.write(Arrays.deepToString(table).getBytes());
                    out.write(System.lineSeparator().getBytes());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return table;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(multiple(7)));
    }
}

