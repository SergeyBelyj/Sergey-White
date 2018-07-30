package set;

import list.DynamicLinkedListCont;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class SimpleSetList<E> implements Iterable<E> {

    DynamicLinkedListCont setList = new DynamicLinkedListCont() ;
    private int size = 0;
    private int sizeIt = 0;

    public void add(E value) {
        boolean cond = true;
        for (int i = 0; i < size; i++){
            if (setList.get(i) == value) cond = false;
        }
        if (cond) {
            setList.add(value);
            size++;
        } else System.out.println("This element is in set, please repeat input");

    }


    public E get(int index) {
        return (E) setList.get(index);
    }

    @Override
    public Iterator<E> iterator() {
        Iterator temp = new Iterator() {
            @Override
            public boolean hasNext() {
                if (sizeIt < size)
                    return true;
                else  return false;
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                E res = null;
                res = (E) setList.get(sizeIt);
                sizeIt++;
                return res;
            }
        };
        return temp;
    }
}
