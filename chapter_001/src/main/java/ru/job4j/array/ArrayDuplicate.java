package ru.job4j.array;

import java.util.Arrays;

public class ArrayDuplicate {
    public String[] remove(String[] array) {
        int length = array.length;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length - 2; j++) {
                if (array[i].equals(array[j])) {
                    array[j] = array[length - 1];
                    length--;
                }
            }
        }
        return Arrays.copyOf(array, length);
    }
}
