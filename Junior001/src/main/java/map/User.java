package map;

import java.util.Calendar;

public class User {
    public User(String name, int children, Calendar birthday) {
        this.name = name;
        this.children = children;
        this.birthday = birthday;
    }

    String name;
    int children;
    Calendar birthday;

}
