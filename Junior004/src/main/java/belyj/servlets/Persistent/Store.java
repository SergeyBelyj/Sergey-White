package belyj.servlets.Persistent;

import belyj.servlets.User;

import java.util.List;

public interface Store {


    void add(User user);
    void update(User user);
    void delete(User user);
    List<User> findAll();
    void findById(int id);
}
