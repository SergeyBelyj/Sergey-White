package map;

import org.junit.Test;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;


public class UserTest {
    @Test
    public void makeTwoObjectsOfUser() {
        User first = new User("Sergey", 0,  25);
        User second = new User("Sergey", 0, 25);
        Map<User, Object> map = new HashMap<>();
        map.put(first,"first");
        map.put(second, "second");
        System.out.println(first.equals(second));
        System.out.println(second.equals(first));
        System.out.println(map);
    }
}