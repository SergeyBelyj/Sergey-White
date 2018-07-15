package ru.job4j.sort;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortUserTest {

    @Test
    public void whenThenAll() {
        TreeSet<User> users = new TreeSet<User>();
        users.add(new User("Сергей", "25"));
        users.add(new User("Иван", "30"));
        users.add(new User("Сергей", "20"));
        users.add(new User("Иван", "25"));
        String expect = "<[" + "Иван, " + "Иван, " + "Сергей, " + "Сергей]" + ">";
        assertThat(users, is(expect));
    }
}