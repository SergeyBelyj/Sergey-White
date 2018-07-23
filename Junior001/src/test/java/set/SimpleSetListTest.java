package set;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleSetListTest {
    @Test
    public void checkIfDublicateAdd() {
        SimpleSetList<Integer> list = new SimpleSetList();
        list.add(1);
        list.add(2);
        list.add(1);
    }

}