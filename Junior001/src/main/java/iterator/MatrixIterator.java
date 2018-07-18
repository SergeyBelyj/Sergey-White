package iterator;


import java.util.Iterator;
import java.util.NoSuchElementException;


public class MatrixIterator implements Iterator {

        private final int[][] values;
        private int  cols = 0;
        private int rows = 0;

    public MatrixIterator(final int[][] values) {
            this.values = values;
        }

        @Override
        public boolean hasNext() {
            return values.length > rows &&  values[rows].length > cols;
        }


        @Override
        public Object next() {
            int result;
            hasNext();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            result = values[rows][cols];
            cols++;
                if (cols >= values[rows].length) {
                    cols = 0;
                    rows++;
                }
            return result;
        }
}




