package iterator;


import java.util.Iterator;
import java.util.NoSuchElementException;


public class Converter {
    Iterator<Integer> convert(Iterator<Iterator<Integer>> it)  {




        return new Iterator<Integer>() {
            private Iterator<Integer> tempIt;


            public boolean hasNext() {
                boolean res = true;
                if ((tempIt == null && it.hasNext()) || (!tempIt.hasNext() && it.hasNext())) {
                    tempIt = it.next();

                } else if (!tempIt.hasNext() && !it.hasNext()) res = false;
                return res;
            }
            @Override
            public Integer next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return tempIt.next();
            }
        };
    }
}
