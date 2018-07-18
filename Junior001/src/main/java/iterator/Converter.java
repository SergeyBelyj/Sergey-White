package iterator;

import java.util.Iterator;

public class Converter {
    Iterator<Integer> convert(Iterator<Iterator<Integer>> it) {



        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return it.next().hasNext();
            }

            @Override
            public Integer next() {
                return it.next().next();
            }
        };
    }
}
