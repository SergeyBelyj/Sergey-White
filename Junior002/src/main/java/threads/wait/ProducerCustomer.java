package threads.wait;

public class ProducerCustomer  {

    private final Object lock = new Object();
    private boolean blockCustomer = true; // thread stack

    public void doSomething() throws InterruptedException {
        synchronized (this.lock) {
            while (this.blockCustomer) {
                System.out.println(String.format("%s Wait", Thread.currentThread().getId()));
                lock.wait();
               // Thread.sleep(11);
            }
            System.out.println(String.format("%s usefull work", Thread.currentThread().getId()));
        }
    }
        public void changeBlock(boolean enable) {
        synchronized (this.lock) {
            System.out.println(String.format("%s enable", Thread.currentThread().getId()));
            this.blockCustomer = enable;
            this.lock.notify();
        }
        }

    public static void main(String[] args) throws InterruptedException {
       final ProducerCustomer blockingWork = new ProducerCustomer();
        Thread tr1 = new Thread() {
            @Override
            public void run() {
                blockingWork.changeBlock(false);
            }
        };

       Thread tr2 =  new Thread() {
            @Override
            public void run() {
                try {
                    blockingWork.doSomething();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        tr2.start();
        tr1.start();
        }

}
