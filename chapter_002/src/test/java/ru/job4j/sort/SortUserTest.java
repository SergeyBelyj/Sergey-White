package ru.job4j.sort;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortUserTest {
    @Test
    public void whenAdd213Then123() {
        Set<User> users = new TreeSet<User>();
        users.add(new User("petr"));
        users.add(new User("ivan"));
        users.add(new User("zuma"));
        String expect = "[ivan, " + "petr, " + "zuma]";
        String res = users.toString();
        assertThat(res, is(expect));
    }
}