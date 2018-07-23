package list;

public class SimpleArrayList<E> {
    private int size;
    private Node<E> first;

    public void add(E date) {
        Node<E> newLink = new Node<E>(date);
        newLink.next = this.first;
        this.first = newLink;
        this.size++;
    }

    public E delete() {
        this.size--;
        E temp = this.first.date;
        this.first = this.first.next;
        return  temp;
    }

    public E get(int index) {
        Node<E> result = this.first;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }
        return result.date;
    }
    public int getSize() {
        return this.size;
    }
    public static class Node<E> {
        E date;
        Node<E> next;
        Node(E date) {
            this.date = date;
        }
    }
}
