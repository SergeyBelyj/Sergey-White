package threads.monitore;

import org.junit.Test;

public class UserStorageTest {


 @Test
 public void proba() {
     UserStorage stor = new UserStorage(2);
     stor.add(new User(1, 200));
     stor.add(new User(2, 300));
     stor.transfer(1, 2, 50);
     System.out.println(stor);
 }

}