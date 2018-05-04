package ru.job4j.array;


import org.junit.Test;

import static org.hamcrest.Matchers.arrayContainingInAnyOrder;

import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
    ArrayDuplicate our = new ArrayDuplicate();
    String [] input = {"Hi", "World", "Hi", "Super", "World"};
    String [] expect = {"Hi", "World", "Super"};
    String[] result = our.remove(input);
        assertThat(result, arrayContainingInAnyOrder(expect));

    }
}