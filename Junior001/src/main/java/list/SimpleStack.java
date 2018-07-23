package list;

public class SimpleStack<E> {

    private int size;
    private SimpleArrayList.Node<E> first;

    public void push(E date) {
        SimpleArrayList.Node<E> newLink = new SimpleArrayList.Node<E>(date);
        newLink.next = this.first;
        this.first = newLink;
        this.size++;
    }
    public E poll() {
        E temp;
        temp =  this.first.date;
        this.size--;
        this.first = this.first.next;
        return  temp;
    }

}
