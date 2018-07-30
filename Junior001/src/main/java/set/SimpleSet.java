package set;

import list.SimpleArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class SimpleSet<T>  implements Iterable<T> {

    private SimpleArrayList setMy = new SimpleArrayList();
    private int sizeIt = 0;
    private int size = 0;

    void add(T obj) {
        if (!setMy.contain(obj)) {
            setMy.add(obj);
            size++;
        }  else System.out.println("This element is in set, please repeat input");
    }

    @Override
    public Iterator<T> iterator() {
        Iterator<T> temp = new Iterator<T>() {
            @Override
            public boolean hasNext() {
                if (sizeIt < size)
                return true;
                else  return false;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T res = null;
                res = (T) setMy.get(sizeIt);
                sizeIt++;
                return res;
            }
        };
        return temp;
    }
}
