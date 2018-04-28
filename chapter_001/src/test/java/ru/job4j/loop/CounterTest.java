package ru.job4j.loop;

import org.junit.Test;



import static org.hamcrest.Matchers.is;

import static org.junit.Assert.*;

public class CounterTest {
    @Test
    public void whenStart1Finish10ThenSum30() {
        int start = 1;
        int finish = 10;
        int result = Counter.add(start, finish);
        int expected = 300;
        assertThat(result, is(expected));

    }
}