package set;

import list.SimpleArrayList;
import org.junit.Test;

public class SimpleSetTest {
    @Test
    public void whenAddTwoElemSameThenNo() {
        SimpleSet<Integer> setM = new SimpleSet<>();
        setM.add(12);
        setM.add(13);
        setM.add(13);
        setM.add(14);
        System.out.println(setM.iterator().next());
        System.out.println(setM.iterator().next());
        System.out.println(setM.iterator().next());
    }

}