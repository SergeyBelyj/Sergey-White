package threads.wait;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

import java.util.LinkedList;
import java.util.Queue;

@ThreadSafe
public class SimpleBlockingQueue<E> {

    @GuardedBy("this")
    private Queue<E> queue = new LinkedList<>();
    private int size = 0;
    private int max;

    public SimpleBlockingQueue(int max) {
        this.max = max;
    }

    public void offer(E value) {
        if (size < max) {
            queue.offer(value);
            size++;
        }
    }

    public E poll() {
        E res = null;
        if (!queue.equals(null)) {
            res = queue.poll();
            size--;
        }
        return res;
    }

    public int getSize() {
        return this.size;
    }

    public int getMax() {
        return this.max;
    }



    @Override
    public String toString() {
        return "SimpleBlockingQueue{" +
                "queue=" + queue.toString() +
                '}';
    }
}