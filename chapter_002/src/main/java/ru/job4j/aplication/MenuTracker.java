package ru.job4j.aplication;



public class MenuTracker {
    private Input input;
    private Tracker tracker;
    private UserAction[] actions = new UserAction[8];

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
        this.actions[2] = new MenuTracker.ShowItems(2,"showAll");
        this.actions[3] = new EditItem(3,"Edit");
        this.actions[4] = new DeletItem(4, "Delete");
        this.actions[5] = new FindIdItem(5, "findById");
        this.actions[6] = new FindNameItem(6, "findByName");
        this.actions[7] = new ExitProgram(7, "exit");

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
            for (Item item : tracker.findAll()) {
                System.out.println(
                        String.format("%s. %s", item.getId(), item.getName())
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
                Item item = new Item(name, desc);
                item.setId(id);
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
        private final StartUI ui = null;

        public ExitProgram(int key, String name) {
            super(key, name);
        }

        @Override
        public void execute(Input input, Tracker tracker) {           
            this.ui.stop();
                }



    }
