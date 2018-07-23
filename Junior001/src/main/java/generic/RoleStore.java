package generic;

public class RoleStore<T extends Role> extends SimpleList implements Iterable {

    public RoleStore(int size) {
        super(size);

    }
}
