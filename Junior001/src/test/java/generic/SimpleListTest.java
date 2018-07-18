package generic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SimpleListTest {

    @Test
    public void whenCreateContainShouldTheSameType() {
    Stack simple = new Stack(4);
    simple.add("test1");
    simple.add("test2");
    simple.add("test3");
    simple.add("test4");
    simple.delete(1);
    String result = simple.get(3);
    assertThat(result, is("test4"));
    }
    public void showList() {
        List<String> list = new ArrayList<>(100);
        List<? super Integer> numbers = new LinkedList<>();
        numbers.add(1);
    }
}