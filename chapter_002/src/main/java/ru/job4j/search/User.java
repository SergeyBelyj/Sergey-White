package ru.job4j.search;

import java.util.Objects;

public class User {
    Integer id;
    String name;
    String city;

    public User(Integer id, String  name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public Integer getId() {
        return id;
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
        return Objects.equals(id, user.id)
                && Objects.equals(name, user.name)
                && Objects.equals(city, user.city);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, city);
    }
}