package ru.job4j.array;

public class ArrayChar {
    private char[] data;

    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }


    public boolean startWith(String prefix) {
        boolean result = true;
        int k = 0;
        char[] value = prefix.toCharArray();
        for (int i = 0; i < value.length; i++) {
            if (data[i] == value [i]) {
                k++;
            }
        }
        if (k == value.length) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }
}