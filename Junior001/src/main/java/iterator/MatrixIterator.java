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
            return ((values.length == cols + 1) && (values[cols].length == rows)) ? false : true;
        }


        @Override
        public Object next() {
            try {
                if (values[cols].length > rows) {
                    return values[cols][rows++];
                } else {
                    rows = 0;
                    cols++;
                    return values[cols][rows++];
                }

            } catch (Exception e) {
                return e.getMessage();
            }
        }
    }

