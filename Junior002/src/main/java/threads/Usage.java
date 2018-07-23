package threads;


public class Usage {


    public static final class Counter {
        long count = 0;

        public void add(long value) {
            this.count += value;
        }
    }
    public static final class CounterThread extends Thread {

        protected final Counter counter;

        public CounterThread(final Counter counter) {
            this.counter = counter;
        }
        @Override
        public void run() {
            counter.add(1);
        }

    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread tr1 =  new CounterThread(counter);
        Thread tr2 =  new CounterThread(counter);
        tr1.start();
        tr2.start();
        tr1.join();
        tr2.join();
        System.out.println(counter.count);
    }
}





