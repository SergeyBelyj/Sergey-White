package iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;


public class MatrixIterator implements Iterator {

        private final int[][] values;
        private int  cols = 0;
        private int rows = 0;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MatrixIterator)) return false;
        MatrixIterator that = (MatrixIterator) o;
        return Arrays.equals(values, that.values);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(values);
    }

    public MatrixIterator(final int[][] values) {
            this.values = values;

        }

        public boolean isNull(int[][] val) {
            boolean res = false;
            try {
                if (val[0].length == 0) {
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                res = true;
            }
            return res;
        }

        @Override
        public boolean hasNext() {
            boolean res = isNull(values);
            return ((values.length == cols + 1) && (values[cols].length == rows) || (res)) ? false : true;
        }


        @Override
        public Object next() {
            hasNext();
            if (!hasNext()) {
                throw new NoSuchElementException();
            } else {
                if (values[cols].length > rows) {
                    return values[cols][rows++];
                } else {
                    rows = 0;
                    cols++;
                    return values[cols][rows++];

                }
            }
        }
    }

