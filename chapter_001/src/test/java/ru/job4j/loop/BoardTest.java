package ru.job4j.loop;

import org.junit.Test;



import static org.hamcrest.Matchers.is;

import static org.junit.Assert.*;
public class BoardTest {
    Board w = new Board();
    @Test
    public void when5x5Then5x5() {

        StringBuffer result = w.paint(5, 5);
        String expected = "X X X"
                +
                          " X X "
                +
                          "X X X"
                +
                          " X X ";
        assertThat(result, is(expected));
    }

    @Test
    public void when3x3Then3x3() {

        StringBuffer result = w.paint(3, 3);
        String expected = "X X"
                +
                " X "
                +
                "X X";

        assertThat(result, is(expected));

    }
}