package ru.job4j.loop;

class Factorial {


    public static int calc(int n) {
        int factor = 0;
        if (n != 0) {
            for (int i = 1; i <= n; i++) {
                factor = factor * i;
            }

        } else {
            factor = 1;
        }
            return factor;
    }

}