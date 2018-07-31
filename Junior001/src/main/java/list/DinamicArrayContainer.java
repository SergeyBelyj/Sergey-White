package list;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static java.lang.System.arraycopy;
@ThreadSafe
public class DinamicArrayContainer<E> implements Iterable<E> {
    @GuardedBy("this")
    private Object[] container;
    protected DinamicArrayContainer(Object[] container) {
        this.container = container;
    }
   // private int size = 0;
    private int iterIndex = 0;

    public synchronized void add(Object[] value) {
       //  size++;
         Object[] list = new Object[container.length + 1];
         arraycopy(value, 0, list, 0, value.length);
         arraycopy(container, 0, list, 1, container.length);
         this.container = list;

    }
   public synchronized E get(int index) {
        return (E) this.container[index];
    }
    @Override
    public synchronized Iterator<E> iterator() {
        Iterator<E> temp = new Iterator<E>() {


            @Override
            public boolean hasNext() {
                return iterIndex < container.length && container[iterIndex] != null;
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException("No more elements in array");
                }
                return (E) container[iterIndex++];
            }
        };
        return temp;
    }

}
