package ru.job4j.loop;

class Counter {
    public static int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if ((i % 2) == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}