package ru.job4j.aplication;

import java.util.Arrays;

public class StartUI {
    private boolean exit = true;
    private Input input;
    private Tracker tracker;
    private int[] ranges = new int[]{1, 2, 3, 4, 5, 6, 7};

   public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public void init() {
        MenuTracker menu = new MenuTracker(this.input, tracker);
        menu.fillActions(this);
        while (this.exit) {
            menu.show();
            menu.select(input.ask("Select:", ranges));

        }
    }

    public void stop() {
        this.exit = false;
    }

    public static void main(String[] args) {
        new StartUI(
                new ValidateInput(
                        new ConsoleInput()
                ),
                new Tracker()
        ).init();
    }
}
