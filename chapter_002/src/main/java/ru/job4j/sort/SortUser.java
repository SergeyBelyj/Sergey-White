package ru.job4j.sort;

import java.util.*;

public class SortUser {

    public static void main(String[] args) {
        Set<User> users = new TreeSet<User>();
        users.add(new User("petr"));
        users.add(new User("ivan"));
        users.add(new User("zuma"));
        System.out.println(users.toString());
    }
}