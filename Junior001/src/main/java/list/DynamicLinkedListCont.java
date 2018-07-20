package list;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;


public class DynamicLinkedListCont<E> implements Iterable<E> {


    private Dat<E> first;
    private int  modCount = 0;
    int modCountIt = 0;
    int index = 0;
    int indexIT = 0;

    public void add(E date) {
        if (indexIT > 0) {
            throw new ConcurrentModificationException();
        } else {
            Dat<E> newLink = new Dat<E>(date);
            newLink.next = this.first;
            this.first = newLink;
            this.modCount++;
        }
    }

    public E get(int index) {
        Dat<E> result = this.first;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }
        return result.date;
    }

    @Override
    public Iterator<E> iterator() {

            Iterator<E> temp = new Iterator<E>() {

                @Override
                public boolean hasNext() {
                    return indexIT < modCount;
                }

                @Override
                public E next() {
                    if (!hasNext()) {
                        throw new NoSuchElementException();
                    }
                    Dat<E> result = first;
                    for (; index > modCountIt; ) {
                        result = result.next;
                        index--;
                    }
                    modCountIt--;
                    indexIT++;
                    index = 0;
                    return result.date;
                }
            };
            return temp;
        }


    private static class Dat<E> {
        E date;
        Dat<E> next;
        Dat(E date) {
            this.date = date;
        }
    }
}

