package list;

public class SimpleStack<E> {
    private int size;
    SimpleArrayList.Node<E> next;
    private DynamicLinkedListCont<E> queue = new DynamicLinkedListCont();

    public void push(E date) {
        queue.add(date);
        size++;
    }
    public E poll() {
        E res = queue.removeLast();
        return (E) res;
    }

}
