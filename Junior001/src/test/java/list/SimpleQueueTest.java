package list;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleQueueTest {

        private SimpleQueue<Integer> queue;
        @Before
        public void beforeTest() {
            queue = new SimpleQueue<Integer>();
            queue.push(1);
            queue.push(2);
            queue.push(3);
            queue.push(4);
            queue.push(5);
            queue.push(6);
        }
        @Test
        public void write() {
            System.out.println(queue.poll());
            System.out.println(queue.poll());
            System.out.println(queue.poll());
            System.out.println(queue.poll());
            System.out.println(queue.poll());
            System.out.println(queue.poll());




        }

    }

