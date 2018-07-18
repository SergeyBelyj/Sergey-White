package set;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class SimpleSet<T>  implements Iterable<T> {



    Object[] set;
    int index = 0;

    public SimpleSet(int size) {

        this.set = new Object[size];
    }

    public int searchIsElem(T obj) {
        int res = -1;
        for (int i = 0; i < index; i++) {
            if (set[i].equals(obj)) {
                res = i;
                break;
            }
        } return res;
        }

    void add(T obj) {
        int condition = searchIsElem(obj);
        if (condition == -1) {
            set[index++] =  obj;
        } else {
            System.out.println("Elem is in Set");
        }
    }

    @Override
    public Iterator iterator() {
        return null;
    }

}
