package iterator;


import java.util.Iterator;
import java.util.NoSuchElementException;


public class Converter {
    Iterator<Integer> convert(Iterator<Iterator<Integer>> it)  {




        return new Iterator<Integer>() {
            private Iterator<Integer> tempIt;

            @Override
            public boolean hasNext() {
                while (tempIt == null || !tempIt.hasNext()) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    tempIt = it.next();
                }
                return true;
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
