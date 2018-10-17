package belyj.servlets;

public class User {
    int id;
    String name;
    String login;
    String email;


    public User(String name) {
        this.name = name;
        this.login = this.name.toLowerCase();
        this.email = this.login + "@gmail.com";

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
