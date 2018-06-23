package ru.job4j.aplication;
public interface Input {
    String  ask(String question);
    int ask(String question, int[] range) throws MenuOutException;
}