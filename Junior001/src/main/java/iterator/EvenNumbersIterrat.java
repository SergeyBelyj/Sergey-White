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
            for (; index < value.length;) {
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
        return (res != -1);
    }

    @Override
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        } else {
            int res = traversal(values);
            indexNext = res + 1;
            return values[res];
        }
    }
}
