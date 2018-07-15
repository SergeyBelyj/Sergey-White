package ru.job4j.sort;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class User {
 String name;
 String age;
 User(String name, String age) {
     this.name = name;
     this.age = age;
 }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return age == user.age
                && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }



    @Override
    public String toString() {
        return  name + " " + age;
    }



}