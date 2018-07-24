package set;

import generic.SimpleList;
import list.SimpleArrayList;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class SimpleSet<T>  implements Iterable<T> {

    SimpleArrayList setMy = new SimpleArrayList();
    private int sizeIt = 0;
    private int size = 0;
    void add(T obj) {
        boolean cond = true;
        for (int i = 0; i < size; i++){
            if (setMy.get(i) == obj) cond = false;
        }
        if (cond) {
            setMy.add(obj);
            size++;
        } else System.out.println("This element is in set, please repeat input");

 }
      T get(int index) {
        return (T) setMy.get(index);
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
