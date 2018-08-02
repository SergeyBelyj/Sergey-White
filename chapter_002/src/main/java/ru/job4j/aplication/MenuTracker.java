package ru.job4j.aplication;


import java.sql.SQLException;

public class MenuTracker {
    private Input input;
    private Tracker tracker;
    private BaseAction[] actions = new BaseAction[8];

    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public MenuTracker() {

    }

    public static void test() {
        MenuTracker tr = new MenuTracker();
    }
    public void fillActions(StartUI ui) {
        this.actions[1] = new AddItem(1,"add");
        this.actions[2] = new ShowItems(2,"showAll");
        this.actions[3] = new EditItem(3,"Edit");
        this.actions[4] = new DeletItem(4, "Delete");
        this.actions[5] = new FindIdItem(5, "findById");
        this.actions[6] = new FindNameItem(6, "findByName");
        this.actions[7] = new ExitProgram(7, "exit",ui);

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
     class AddItem extends BaseAction {
        public AddItem(int key, String name) {
            super(key, name);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String name = input.ask("Enter name:");
            String desc = input.ask("Enter description:");
                tracker.add(new Item(name, desc));
        }

    }
    // show all
     static class ShowItems extends BaseAction {


        protected ShowItems(int key, String name) {
            super(key, name);
        }
        @Override
        public void execute(Input input, Tracker tracker) {
            for (String item : tracker.findAll()) {
                System.out.println(
                        String.format(item)
                );
            }
        }
    }
        // edit
         class EditItem extends BaseAction {

            protected EditItem(int key, String name) {
                super(key, name);
            }
            @Override
            public void execute(Input input, Tracker tracker) {
                String id = input.ask("Please, enter the task's id");
                String name = input.ask("Please, enter the task's name");
                String desc = input.ask("Please, enter the task's desc");
                Item item = new Item(id, name, desc);
                item.setId(id);
                item.setName(name);
                item.setDesc(desc);
                tracker.edit(item);
            }

            }
    }
    // del
     class DeletItem extends BaseAction {
        public DeletItem(int key, String name) {
            super(key, name);
        }
        @Override
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Please, enter the task's id");
            tracker.delete(id);
        }

    }
    // findById
     class FindIdItem extends BaseAction {
        public FindIdItem(int key, String name) {
            super(key, name);
        }
        @Override
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Please, enter the task's id");
            System.out.println(tracker.findById(id));
        }

    }
    // find by name
     class FindNameItem extends BaseAction {
        public FindNameItem(int key, String name) {
            super(key, name);
        }
        @Override
        public void execute(Input input, Tracker tracker) {
            String name = input.ask("Please, enter the task's name");
            System.out.println(tracker.findByName(name));
        }

    }
    //exit program
     class ExitProgram extends BaseAction {
        private final StartUI ui;


        public ExitProgram(int key, String name, StartUI ui) {
            super(key, name);
            this.ui = ui;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            try {
                this.ui.stop();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }



    }
