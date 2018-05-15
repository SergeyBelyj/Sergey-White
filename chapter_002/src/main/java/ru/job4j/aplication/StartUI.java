package ru.job4j.aplication;
public class StartUI {
    private Input input;

    public StartUI(Input input) {
        this.input = input;
    }

    public  void init() {
        Tracker tracker = new Tracker();
        ConsoleInput out = new ConsoleInput();
        boolean exit = true;
        while(exit) {
            String name = input.ask("0. Add new Item\n" +
                    "1. Show all items\n" +
                    "2. Edit item\n" +
                    "3. Delete item\n" +
                    "4. Find item by Id\n" +
                    "5. Find items by name\n" +
                    "6. Exit Program\n" +
                    "Select: ");
            if (Integer.parseInt(name) == 1) {
                System.out.println(tracker.findAll());
            } else if (Integer.parseInt(name) == 2) {
                String id = input.ask("please write id");
               String nameItem =  input.ask("please write item");
               Item item = new Item(name);
               tracker.replace(id, item);

            } else if (Integer.parseInt(name) == 0) {
                String nameItem = input.ask("Please write item");
                Item item = new Item(nameItem);
                tracker.add(item);

            } else if (Integer.parseInt(name) == 3) {
               String id = input.ask("Please write id");
                tracker.delete(id);
            } else if (Integer.parseInt(name) == 4) {
               String id = input.ask("Plaese write id");

               String as =  tracker.findById(id).getName();
               out.ask(as);
            } else if (Integer.parseInt(name) == 5) {
               String nameItem = input.ask("Please write name");
              out.ask(tracker.findByName(nameItem).toString());0
            } else if (Integer.parseInt(name) == 6) {
                exit = false;
            }

        }
    }

    public static void main(String[] args) {
       // Input input = new StubInput(new String[] {"create stub task"});
        Input input = new ConsoleInput();
        new StartUI(input).init();
    }
}