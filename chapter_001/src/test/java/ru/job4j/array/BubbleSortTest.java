package ru.job4j.array;

import org.hamcrest.Matchers;
import org.junit.Test;


import static org.junit.Assert.assertThat;

public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort array = new BubbleSort();
        int[] input = new int[]{5, 2, 1, 4, 10, 3, 8, 9};
        int[] result = array.sortirovka(input);
        int[] expect = new int[]{1, 2, 3, 4, 5, 8, 9, 10};
        assertThat(result, Matchers.is(expect));
    }
}