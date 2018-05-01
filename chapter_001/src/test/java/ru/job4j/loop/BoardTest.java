package ru.job4j.loop;

import org.junit.Test;



import static org.hamcrest.Matchers.is;

import static org.junit.Assert.*;
public class BoardTest {
    Board w = new Board();
    @Test
    public void when5x5Then5x5() {

        String result = w.paint(5, 5);
        String expected = "X X X \\r\\n X X X\\r\\nX X X \\r\\n X X X\\r\\nX X X \\r\\n X X X\\r\\n";
        assertThat(result, is(expected));
    }

    @Test
    public void when3x3Then3x3() {

        String result = w.paint(3, 3);
        String expected = "X X \\r\\n X X\\r\\nX X \\r\\n X X\\r\\n";

        assertThat(result, is(expected));

    }
}