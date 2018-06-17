package ru.job4j.aplication;

public interface UserAction {
    int key();
    void execute(Input input, Tracker tracker);
    String info();

}