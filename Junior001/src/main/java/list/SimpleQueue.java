package list;

public class SimpleQueue<E> {
    private int size;
    private SimpleArrayList.Node<E> first;

    public void push(E date) {
        SimpleArrayList.Node<E> newLink = new SimpleArrayList.Node<E>(date);
        newLink.next = this.first;
        this.first = newLink;
        this.size++;
    }
    public E poll() {
            SimpleArrayList.Node<E> result = this.first;
            for (int i = -1; i < size - 2; i++) {
                result = result.next;

            }
            this.size--;

        SimpleArrayList.Node<E> temp = this.first;
        for (int i = -1; i < size - 2; i++) {
            temp = temp.next;
        }

        System.out.println(temp.date + " --- ");

            return result.date;
    }


        public E get(int index) {
            SimpleArrayList.Node<E> result = this.first;
            for (int i = 0; i < index; i++) {
                result = result.next;
            }
            return result.date;
        }
    }

