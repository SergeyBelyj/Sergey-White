package ru.job4j.aplication;

public class MenuTracker {
    private Input input;
    private Tracker tracker;
    private UserAction[] actions = new UserAction[7];

    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public MenuTracker() {

    }

    public static void test() {
        MenuTracker tr = new MenuTracker();
        AddItem item = tr.new AddItem();
    }
    public void fillActions() {
        this.actions[1] = new AddItem();
        this.actions[2] = new MenuTracker.ShowItems();
        this.actions[3] = new EditItem();
        this.actions[4] = new DeletItem();
        this.actions[5] = new FindIdItem();
        this.actions[6] = new FindNameItem();

    }
    public void select(int key) {
        this.actions[key].execute(this.input, this.tracker);
    }

    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }
    // add
    private class AddItem implements UserAction {
        public int key() {
            return 1;
        }
        public void execute(Input input, Tracker tracker) {
            String name = input.ask("Please, enter the task's name");
            String desc = input.ask("Please, enter the task's desc");
            tracker.add(new Item(name, desc));
        }
        public String info() {
            return String.format("%s. %s", this.key(), "Add the new item.");
        }
    }
    // show all
    private static class ShowItems implements UserAction {
        public int key() {
            return 2;
        }

        public void execute(Input input, Tracker tracker) {
            for (Item item : tracker.findAll()) {
                System.out.println(
                        String.format("%s. %s", item.getId(), item.getName())
                );
            }
        }

        public String info() {
            return String.format("%s. %s", this.key(), "Show all items");
        }
    }
        // edit
        private class EditItem implements UserAction {
            public int key() {
                return 3;
            }
            public void execute(Input input, Tracker tracker) {
                String id = input.ask("Please, enter the task's id");
                String name = input.ask("Please, enter the task's name");
                String desc = input.ask("Please, enter the task's desc");
                Item item = new Item(name, desc);
                item.setId(id);
                tracker.edit(item);
            }
            public String info() {
                return String.format("%s. %s", this.key(), "Edit item.");
            }
    }
    // del
    private class DeletItem implements UserAction {
        public int key() {
            return 4;
        }
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Please, enter the task's id");
            tracker.delete(id);
        }
        public String info() {
            return String.format("%s. %s", this.key(), "Delete item.");
        }
    }
    // findById
    private class FindIdItem implements UserAction {
        public int key() {
            return 5;
        }
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Please, enter the task's id");
            System.out.println(tracker.findById(id));
        }
        public String info() {
            return String.format("%s. %s", this.key(), "Find item by id.");
        }
    }
    // find by name
    private class FindNameItem implements UserAction {
        public int key() {
            return 6;
        }
        public void execute(Input input, Tracker tracker) {
            String name = input.ask("Please, enter the task's name");
            System.out.println(tracker.findByName(name));
        }
        public String info() {
            return String.format("%s. %s", this.key(), "Find item by name.");
        }
    }

}