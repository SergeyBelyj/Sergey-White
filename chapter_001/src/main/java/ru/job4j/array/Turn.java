package ru.job4j.array;

public class Turn {
    public int[] turn(int[] array) {

        for (int i = 0; i < (array.length / 2); i++) {
            int temp;
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;

        }
        return array;
    }
}