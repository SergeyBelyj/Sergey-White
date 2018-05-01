package ru.job4j.loop;

class Factorial {


    public static int calc(int n) {
        int factor = 1;
        if (n != 0) {
            for (int i = 1; i <= n; i++) {
                factor = factor * i;
            }

        }
            return factor;
    }

}