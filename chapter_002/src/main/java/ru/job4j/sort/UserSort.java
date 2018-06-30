package ru.job4j.sort;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UserSort implements Comparable<User> {
    private UserSort name;

    public Set<User> sort(List<User> list) {
        TreeSet<User> result = null;
        return  result;
    }

    @Override
    public int compareTo(User o) {
        return this.name.compareTo(o);
    }
}