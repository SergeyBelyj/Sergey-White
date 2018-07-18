package list;

import java.util.Iterator;

import static java.lang.System.arraycopy;

public class DinamicArrayContainer<E> implements Iterable<E> {

    Object[] container;
    public DinamicArrayContainer(Object[] container) {
        this.container = container;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

     E add(Object[] value) {
         Object[] list = new Object[container.length + 1];
         arraycopy(value, 0, list, 0, value.length);
         arraycopy(container, 0, list, 1, container.length);
         this.container = list;
    return null;
    }
    E get(int index) {
        return (E) this.container[index];
    }

}
