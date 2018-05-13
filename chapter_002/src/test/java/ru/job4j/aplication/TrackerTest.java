package ru.job4j.aplication;


import org.junit.Test;


import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1","testDescription",123L);
        tracker.add(item);
        Item next = new Item("test2","testDescription2",1234L);
        tracker.add(next);
        assertThat(tracker.findAll()[1], is(next));
    }
    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1","testDescription",123L);

        tracker.add(previous);

        Item next = new Item("test2","testDescription2",1234L);

        next.setId(previous.getId());

        tracker.replace(previous.getId(), next);

        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }
    @Test
    public void whenAddThenReturnGetAll() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1","testDescription",123L);
        tracker.add(previous);
        assertThat(tracker.findAll(), is(previous));
    }

}
