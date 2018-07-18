package iterator;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class EvenNumbersIterratTest {
    private Iterator<Integer> it;

    @Before
    public void setUp() {
        it = new EvenNumbersIterrat(new int[]{4, 2, 1, 1});
    }

    @Test
    public void returnEvenNumbers() {
        assertThat(it.next(), is(4));
        assertThat(it.next(), is(2));
        assertThat(it.hasNext(), Matchers.is(false));

    }

}