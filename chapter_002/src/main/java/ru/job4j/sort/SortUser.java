package ru.job4j.sort;

import java.util.*;

public class SortUser  implements Comparable<User> {
    private SortUser  name;
    @Override
    public String toString() {
        return "SortUser{" + "name=" + this.name + '}';
    }

    public static void main(String[] args) {
        Set<User> users = new TreeSet<User>();
        users.add(new User("petr"));
        users.add(new User("ivan"));
        users.add(new User("zuma"));
        System.out.println(users);
    }

    @Override
    public int compareTo(User o) {
        return 0;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SortUser sortUser = (SortUser) o;
        return Objects.equals(name, sortUser.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }
}