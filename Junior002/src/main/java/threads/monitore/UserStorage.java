package threads.monitore;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

@ThreadSafe
public class UserStorage extends User {
    @GuardedBy("this")
    private int i = 1;
    private int size;
    private User[] user;

    UserStorage(int size) {
        super();
        this.user = new User[size + 1];    }


   public synchronized boolean  add (User user) {
        this.user[i] = user;
        i++;
        return true;
    }
   public synchronized boolean update(User user) {
        if (this.user[i].id == user.id) {
            this.user[i].amount = user.amount;
        }
        return true;
    }
    public synchronized boolean delete(User user) {
        for (int index = 0; index < i; index++) {
        if (this.user[index].id == user.id) {
            this.user[index] = this.user[index + 1];
            i--;
        }
        }

        return true;
    }
   public synchronized void transfer(int fromId, int toId, int amount) {
        for (int index = 1; index < i; index++) {
            if (this.user[index].id == toId) {
                for (int ind = 1; ind < i; ind++)
                    if (this.user[ind].id == fromId) {
                    this.user[index].amount += amount;
                    this.user[ind].amount -= amount;
                    break;
                    }
            }
        }
    }

}


