package ru.job4j.array;

public class BubbleSort {
    public int[] sortirovka(int[] array) {
        int i = 0;

       while (i < (array.length - 1)) {
                int temp;
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array [i + 1];
                    array [i + 1] = temp;
                    i = 0;
             } else {
                    i++;
                }

        }

        return array;
    }
}