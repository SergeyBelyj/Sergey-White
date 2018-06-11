package ru.job4j.search;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UserConvertTest {
    @Test
    public void userToHashMap() {
        UserConvert temp = new UserConvert();
        HashMap<Integer, User> expect = new HashMap<Integer, User>();
        List<User> list = new ArrayList<User>();
        User n1 = new User(1, "name1", "city1");
        User n2 = new User(2, "name2", "city2");
        User n3 = new User(3, "name3", "city3");
        list.add(n1);
        list.add(n2);
        list.add(n3);
        expect = temp.process(list);
        HashMap<Integer, User> result = new HashMap<>();
        result.put(1, new User(1, "name1", "city1"));
        result.put(2, new User(2, "name2", "city2"));
        result.put(3, new User(3, "name3", "city3"));
        assertThat(result, is(expect));
    }
}