package set;

import java.util.Iterator;
import java.util.LinkedList;

public class SimpleSetList<E> implements Iterable<E> {

    LinkedList list = new LinkedList();
    int kol = 0;

    int finCopyElem(E obj) {
        int res = 0;
        if (kol != 0) {
            Iterator iterator = list.iterator();
            if (iterator.hasNext()) {
                if (iterator.next().equals(obj)) {
                    res = 1;
                }
            }
        }
       return res;
    }

    void add(E obj) {
        int res = finCopyElem(obj);
        if (res == 0) {
            list.add(obj);
            kol++;
        }
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
