package belyj.servlets.Logic;

import belyj.servlets.Persistent.MemoryStore;
import belyj.servlets.User;

public class ValidateService {
    private static final ValidateService instance = new ValidateService();

    private ValidateService(){}

    public static ValidateService instance(){
        return instance;
    }
    private MemoryStore memory;

    public void add(String name) {
        memory.add(new User(name));
    }

}
