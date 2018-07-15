package Iterator;

import java.util.Iterator;


public class MatrixIterator implements Iterator {

        private final int[][] values;
        private int  cols = 0;
        private int rows = 0;



        public MatrixIterator(final int[][] values) {

            this.values = values;
        }

        @Override
        public boolean hasNext() {
             if ((values.length == (cols + 1)) && (values[cols].length == rows )) {
                 return false;
             } else return true;
        }

        @Override
        public Object next() {
            if (values[cols].length > rows) {
                return values[cols][rows++];
            } else {
                rows = 0;
                cols++;
                return values[cols][rows++];
            }

        }
    }

