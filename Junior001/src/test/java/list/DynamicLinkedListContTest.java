package list;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class DynamicLinkedListContTest {
    DynamicLinkedListCont<Integer> linkList;

    @Before
    public void beforeTest() {
        linkList = new DynamicLinkedListCont<Integer>();
        linkList.add(10);
        linkList.add(20);
        linkList.add(30);
        linkList.add(40);
        linkList.add(50);
        linkList.add(60);

    }
    @Test
    public void whenThen() {


        System.out.println(linkList.removeFirst());
        System.out.println(linkList.removeLast());



    }

}