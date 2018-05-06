package ru.job4j.loop;

class Factorial {


    public static int calc(int n) {
        int factor = 1;

            for (int i = 1; i <= n; i++) {
                factor *= i;
            }


            return factor;
    }

}