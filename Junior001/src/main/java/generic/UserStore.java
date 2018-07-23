package generic;

public class UserStore<T extends User> extends SimpleList implements Iterable {

    public UserStore(int size) {
        super(size);
    }

}
