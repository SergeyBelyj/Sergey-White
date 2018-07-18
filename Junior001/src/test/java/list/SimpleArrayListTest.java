package list;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SimpleArrayListTest {
    private SimpleArrayList<Integer> list;
    @Before
    public void beforeTest() {
        list = new SimpleArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
    }
    @Test
    public void whenAddThreeElementsThenUseGetOneResultTwo() {
        list.delete();
        assertThat(list.get(0), is(5));
    }
    @Test
    public void whenAddThreeElementsThenUseGetSizeResultThree() {
        list.delete();
        assertThat(list.getSize(), is(5));
    }
}