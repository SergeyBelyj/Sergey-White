package ru.job4j.aplication;

import java.util.Arrays;

public class StartUI {
    private Input input;
    private Tracker tracker = new Tracker();
    private static final String EXIT = "6";
    private static final String ADD = "0";
    private static final String ALL = "1";
    private static final String EDIT = "2";
    private static final String DEL = "3";
    private static final String FID = "4";
    private static final String FNM = "5";

    public StartUI(Input input, Tracker tracker) {
        this.input =  input;
        this.tracker = tracker;
    }

    public StartUI(Input input) {
        this.input =  input;
    }

    public  void init() {
        boolean exit = true;
        while (exit) {
            String answer = input.ask("0. Add new Item\n"
                   + "1. Show all items\n"
                   + "2. Edit item\n"
                   + "3. Delete item\n"
                   + "4. Find item by Id\n"
                   + "5. Find items by name\n"
                   + "6. Exit Program\n"
                   + "Select: ");
            if (answer.equals(ALL)) {
                System.out.println(Arrays.toString(showAll()));
            } else if (answer.equals(EDIT)) {
                editItem();
            } else if (answer.equals(ADD)) {
                createItem();
            } else if (answer.equals(DEL)) {
                deleteByIdItem();
            } else if (answer.equals(FID)) {
                System.out.println(findByI());
            } else if (answer.equals(FNM)) {
                System.out.println(Arrays.toString(findByN()));
            } else if (answer.equals(EXIT)) {
                exit = false;
            }
        }
    }
    private void createItem() {
        System.out.println("------------ Добавление новой заявки --------------");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        Item item = new Item(name, desc);
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с именем : " + name + " добавлена -----------");
    }

    private void editItem() {
        System.out.println("------------ Изменение заявки --------------");
        String id = this.input.ask("Введите id заявки :");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        Item item = new Item(name, desc);
        this.tracker.replace(id, item);
        System.out.println("------------ Заявка с id : " + id + " изменина -----------");
    }

    private void deleteByIdItem() {
        System.out.println("------------ Удаление заявки --------------");
        String id = this.input.ask("Введите id заявки :");
        this.tracker.delete(id);
        System.out.println("------------ Заявка с id : " + id + " удалена -----------");
    }

    private Item[] showAll() {
        return   this.tracker.findAll();
    }

    private Item findByI() {
        System.out.println("------------ Поиск заявки по id --------------");
        String id = this.input.ask("Введите id заявки :");
        return this.tracker.findById(id);
    }

    private Item[] findByN() {
        System.out.println("------------ Поиск заявки по имени --------------");
        String name = this.input.ask("Введите имя заявки :");
        return this.tracker.findByName(name);
    }

    public static void main(String[] args) {
      // Input input = new StubInput(new String[] {"created new task"});
        Input input = new ConsoleInput();
        new StartUI(input).init();
    }

}