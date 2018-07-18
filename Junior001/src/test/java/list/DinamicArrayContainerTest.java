package list;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class DinamicArrayContainerTest {

    private DinamicArrayContainer<Integer> list;
    @Before
    public void beforeTest() {
        list = new DinamicArrayContainer<Integer>(new Object[]{1, 2, 3, 4});
        list.add(new Object[]{1});
        list.add(new Object[]{2});

    }
    @Test
    public void whenaddSixThenSixHave() {
      int result = list.get(0);
      assertThat(result, is(1));
    }
}