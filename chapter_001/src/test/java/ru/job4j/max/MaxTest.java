package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Sergey Belyj (sergiuszbelyj@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class MaxTest {

    @Test
    public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenSecondLessFirst() {
        Max maxim = new Max();
        int result = maxim.max(2, 1);
        assertThat(result, is(2));
    }
    @Test
    public void when3Elements() {
        Max maxim = new Max();
        int result = maxim.max(2, 1, 3);
        assertThat(result, is(3));
    }
}