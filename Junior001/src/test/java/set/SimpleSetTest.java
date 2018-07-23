package set;

import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.*;

public class SimpleSetTest {
    @Test
    public void whenAddTwoElemSameThenNo() {
        SimpleSet<Integer> set = new SimpleSet<Integer>(10);
        set.add(1);
        set.add(1);
        System.out.println(set.hashCode());
    }

}