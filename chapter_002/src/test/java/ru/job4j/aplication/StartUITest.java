package ru.job4j.aplication;


import org.junit.Test;


import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StartUITest {
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();     // создаём Tracker
        Input input = new StubInput(new String[]{"1", "test name", "desc", "7"});   //создаём StubInput с последовательностью действий
        new StartUI(input, tracker).init();     //   создаём StartUI и вызываем метод init()
        assertThat(tracker.findAll()[0].getName(), is("test name")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
    }

    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        // создаём Tracker
        Tracker tracker = new Tracker();
        //Напрямую добавляем заявку
        Item item = new Item();
        //создаём StubInput с последовательностью действий
        Input input = new StubInput(new String[]{"1", "test name", "desc", "7"});
        // создаём StartUI и вызываем метод init()
        new StartUI(input, tracker).init();
        item = tracker.findAll()[0];
        // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
        assertThat(tracker.findById(item.getId()).getName(), is("test name"));
    }
    @Test
    public void whenDeleteById() {
       Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"1", "test name", "desc", "7"});
      new StartUI(input, tracker).init();
        tracker.add(new Item("test name2", "desc2"));
        String id = tracker.findAll()[0].getId();
        tracker.delete(id);
        assertThat(tracker.findAll(), is(tracker.findByName("test name2")));
    }
}