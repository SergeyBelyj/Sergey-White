package ru.job4j.aplication;


import org.junit.Test;


import static org.hamcrest.Matchers.arrayContainingInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L);
        tracker.add(item);
        Item next = new Item("test2", "testDescription2", 1234L);
        tracker.add(next);
        assertThat(tracker.findAll()[1], is(next));
    }
    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription", 123L);
        tracker.add(previous);
        Item next = new Item("test2", "testDescription2", 1234L);
        next.setId(previous.getId());
        tracker.replace(previous.getId(), next);
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }
    @Test
    public void whenAddThenReturnGetAll() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription", 123L);
        tracker.add(previous);
        assertThat(tracker.findAll(), arrayContainingInAnyOrder(previous));
    }

    @Test
    public void whenAddThenReturnGetAll2() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription", 123L);
        tracker.add(previous);
        assertThat(tracker.findAll()[0].getName(), is("test1"));
    }
    @Test
    public void whenAdd2AndDel1ThenReturn1() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription", 123L);
        Item previous2 = new Item("test2", "testDescription2", 12L);
        tracker.add(previous);
        tracker.add(previous2);
        tracker.delete(previous.getId());
        assertThat(tracker.findAll()[0].getName(), is("test2"));
    }

}
