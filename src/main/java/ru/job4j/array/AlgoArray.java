package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        //                       0  1  2  3  4
        int temp = array[0]; /* переменная для временного хранения значение ячейки с индексом 0. */
        array[0] = array[3]; /* записываем в ячейку с индексом 0 значение ячейки с индексом 3. */
        array[3] = array[4]; /* записываем в ячейку с индексом 3 значение временной переменной. */
        int reserve = array[1];
        array[1] = array[2];
        array[2] = reserve;
        array[4] = temp;
        for (int i : array) {
            System.out.println(i);
        }
    }
}