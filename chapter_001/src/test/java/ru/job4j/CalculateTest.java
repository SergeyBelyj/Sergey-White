package ru.job4j;

import org.hamcrest.Matcher;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.Object;



import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Sergey Belyj (sergiuszbelyj@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class CalculateTest {
    /**
     * Test add.
     */
    @Test
    public void whenAddOneToOneThenTwo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Calculate.main(null);
        assertThat(out.toString(), (Matcher<? super String>) is(
                        String.format(
                                "Hello World%s",
                                System.getProperty("line.separator")
                        )
                )
        );
    }
}