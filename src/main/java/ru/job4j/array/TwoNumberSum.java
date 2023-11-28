package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 1;
        int j = 0;
        while (j < array.length) {
            if (array[j] + array[i] == target) {
                return new int[]{j, i};

            }
            if (i < array.length - 1) {
                i++;
            } else if (i == array.length - 1) {
                i = j;
                j++;
            }
        }
        return new int[0];
    }
}
