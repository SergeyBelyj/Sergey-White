package belyj.servlets.Persistent;

import belyj.servlets.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MemoryStore implements Store {
    private static final Logger Log = LoggerFactory.getLogger(MemoryStore.class);

    private List<User> users = new CopyOnWriteArrayList<User>();


    public MemoryStore() {
    }

    @Override
    public synchronized void add(User user) {
         this.users.add(user);
    }

    @Override
    public synchronized void update(User user) {

    }

    @Override
    public synchronized void delete(User user) {
        this.users.remove(user);
    }

    @Override
    public synchronized List<User> findAll() {
        return this.users;
    }

    @Override
    public synchronized void findById(int id) {
        this.users.get(id);
    }
    int size(){
      return  this.users.size();
    }
}
