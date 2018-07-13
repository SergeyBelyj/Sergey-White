package ru.job4j.sort;

import sun.reflect.generics.tree.Tree;

import java.util.*;

public class SortUser {

    public static List<User> sortNameLength(ArrayList<User> users) {
        users.sort(
                new Comparator<User>() {
                    @Override
                    public int compare(User o1, User o2) {
                        return o1.name.compareTo(o2.name);
                    }
                }
        );
        return users;
    }
    public static List<User> sortByAllFields (List<User> users) {
        users.sort(
                new Comparator<User>() {
                    @Override
                    public int compare(User o1, User o2) {

                             return o1.name == o2.name ? o1.age.compareTo(o2.age) : o1.name.compareTo(o2.name);

                    }
                }
        );
        return users;
    }


    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Сергей", "25"));
        users.add(new User("Иван", "30"));
        users.add(new User("Сергей", "20"));
        users.add(new User("Иван", "25"));

        System.out.println(users);
        System.out.println(sortNameLength(users));
        System.out.println(sortByAllFields(users));


    }

}