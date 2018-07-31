package list;


import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class DynamicLinkedListCont<E> implements Iterable<E>  {


    private Dat<E> first;
    private int size = 0;
    private int modCount = 0;
    private int expectedModCount = 0;

    public synchronized void add(E date) {
        Dat<E> newLink = new Dat<E>(date);
        newLink.next = this.first;
        this.first = newLink;
        this.size++;
        this.modCount++;

    }
    public synchronized E get(int index) {
        Dat<E> result = this.first;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }
        return result.date;
    }

    public synchronized boolean contain(E value)  {
        boolean res = false;
        Dat<E> result = this.first;
        for (int i = 0; i < size; i++) {
            if (result.date == value) {
                res = true;
            }
            result = result.next;
        }
        return res;
    }

   public synchronized E removeFirst() {
    E result = null;
    Dat<E> newLink1 = null;
    for (int i = 0; i < size - 1; i++) {
        Dat<E> newLink = new Dat<E>(this.first.date);
        newLink.next = newLink1;
        newLink1 = newLink;
        this.first = this.first.next;
    }
       result = this.first.date;
       Dat<E> newLink2 = null;
       for (int i = 0; i < size - 1; i++) {
           Dat<E> newLink = new Dat<E>(newLink1.date);
           newLink.next = newLink2;
           newLink2 = newLink;
           newLink1 = newLink1.next;
       }
       this.first = newLink2;

    this.size--;
    this.modCount++;
    return result;
   }

    public synchronized E removeLast() {
        E result = null;
        result = this.first.date;
        Dat<E> newLink = this.first.next;
        this.first = newLink;
        modCount++;
        size--;
        return result;

    }


    @Override
    public synchronized Iterator<E> iterator() {
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


