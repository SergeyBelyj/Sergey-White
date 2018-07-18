package iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class EvenNumbersIterrat implements Iterator {


    private final int[] values;
    private int index = 0;
    private int indexNext = 0;

    public EvenNumbersIterrat(int[] values) {
        this.values = values;
    }

        public int traversal(int[] value) {
            int result = -1;
            index = indexNext;
            for (; index < value.length; ) {
                if (value[index] % 2 == 0) {
                    result = index;
                    index++;
                    break;
                } else {
                    index++;
                }
            } return result;
        }

    @Override
    public boolean hasNext() {
        int res = traversal(values);
        return (res == -1) ? false : true;
    }

    @Override
    public Object next() {
        int res = traversal(values);
        indexNext = res + 1;
        return (res != -1) ? values[res] : new NoSuchElementException();
    }
}
