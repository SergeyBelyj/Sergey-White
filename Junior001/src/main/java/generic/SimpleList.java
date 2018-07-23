package generic;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import static java.lang.System.arraycopy;
import static java.lang.System.in;

public class SimpleList<T> implements Iterable<T> {


    Object[] objects;
    int index = 0;
    private int iterIndex = 0;

    public SimpleList(int size) {
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
    public void delete(int ind) {
        Object[] news = new Object[index - 1];
        arraycopy(this.objects, 0, news, 0, ind);
        arraycopy(this.objects, ind + 1, news, ind, this.objects.length - ind - 1);
        this.objects = news;
        index--;

    }


    @Override
    public Iterator<T> iterator() {
        Iterator<T> temp = new Iterator<T>() {



            @Override
            public boolean hasNext() {
                return iterIndex < index && objects[iterIndex] != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return (T) objects[iterIndex++];
            }
        };
        return temp;
    }
}
