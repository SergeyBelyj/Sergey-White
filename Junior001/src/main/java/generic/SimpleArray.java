package generic;


import java.util.Iterator;

public class SimpleArray<T extends Base> implements Iterable<T> {

    Object[] objects;
    int index = 0;

    public SimpleArray(int size) {
        this.objects = new Object[size];
    }

    public void add(T value) {
        this.objects[index++] = value;
    }
    public T get(int position) {
        return (T) this.objects[position];
    }
    public void set(int index, T list) {
        this.objects[index] = list;
    }
    public void delete(int inedx) {
        this.objects[inedx] = null;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
