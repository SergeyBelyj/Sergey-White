package Iterator;

import java.util.Iterator;

public class EvenNumbersIterrat implements Iterator {

    private final int[] values;
    private int index = 0;

    public EvenNumbersIterrat(int[] values) {
        this.values = values;
    }


    @Override
    public boolean hasNext() {
        if (values[index] % 2 == 0) return true;
        else  return false;
    }

    @Override
    public Object next() {
        if (values[index] % 2 == 0) {
            return values[index++];
        } else return null;
    }
}
