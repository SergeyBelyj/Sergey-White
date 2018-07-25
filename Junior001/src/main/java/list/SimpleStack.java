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
        E res = null;
        DynamicLinkedListCont<E> newQueue = new DynamicLinkedListCont<E>();
        for (int i = size - 1 ; i >= 0; i--){
            if (i == 0) {
                res = this.queue.get(i);
            } else { newQueue.add(this.queue.get(i)); }
        }
        size--;
        queue = newQueue;
        return (E) res;
    }

}
