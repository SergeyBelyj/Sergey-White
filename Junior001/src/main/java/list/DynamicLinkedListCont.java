package list;


import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class DynamicLinkedListCont<E> implements Iterable<E>  {


    private Dat<E> first;
    private int size = 0;
    private int modCount = 0;
    private int expectedModCount = 0;

    public void add(E date) {
        Dat<E> newLink = new Dat<E>(date);
        newLink.next = this.first;
        this.first = newLink;
        this.size++;
        this.modCount++;

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
        if (expectedModCount == 0) expectedModCount = modCount;
        Iterator<E> temp = new Iterator<E>() {

                @Override
                public boolean hasNext () {
                if (first != null) {
                    return true;
                } else return false;
            }
                @Override
                public E next () {
                if (!hasNext()) {
                    throw new NoSuchElementException("No more elements in container");
                } else if (modCount != expectedModCount)
                    throw new ConcurrentModificationException();
                E res = first.date;
                first = first.next;
                return res;
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


