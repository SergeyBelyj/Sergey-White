package map;


import java.util.Objects;

public class User {



    public User(String name, int children, int birthday) {
        this.name = name;
        this.children = children;
        this.birthday = birthday;
    }

    String name;
    int children;
    int birthday;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (children != user.children) return false;
        if (birthday != user.birthday) return false;
        return name != null ? name.equals(user.name) : user.name == null;
    }


}
