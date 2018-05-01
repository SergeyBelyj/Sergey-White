package ru.job4j.calculator;


public class Converter {


    public int rubleToEuro(int value) {
        return (value / 70);
    }


    public int rubleToDollar(int value) {
        return (value / 60);
    }

    public float euroToRuble(int value) {
        return (value * 70);
    }

    public float dollarToRuble(int value) {
        return (value * 60);
    }
}