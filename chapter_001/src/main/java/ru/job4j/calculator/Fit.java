package ru.job4j.calculator;



public class Fit {


    public double manWeight(double height) {
        return ((height - 100) * 1.15);
    }


    public double womanWeight(double height) {
        return ((height - 110) * 1.15);
    }
}