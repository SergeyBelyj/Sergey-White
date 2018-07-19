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
    public int hashCode() {
        return Objects.hash(name, children, birthday);
    }
}
