package threads.wait;

public class Producer<E>  {
    SimpleBlockingQueue<E> que = new SimpleBlockingQueue<>(1);
    private final Object lock = new Object();
    private boolean pro = true;
    private boolean con = true;



    public void producer(E data) throws InterruptedException {
        synchronized (this.lock) {
             {
                 while (pro) {
                     if (que.getSize() == que.getMax()) {
                         System.out.println(Thread.currentThread().getId() + " wait add " );
                         con = false;
                         lock.wait();
                     } else { que.offer(data);
                         System.out.println("add");  con = false;}
                 }
            }
            System.out.println(Thread.currentThread().getId() + " add  ");
            que.offer(data);
            con = false;
            lock.notifyAll();
            pro = true;

         }
    }

    public E consumer() throws InterruptedException {
        E res = null;
        synchronized (this.lock) {
            while (con) {
                if (que.getSize() == 0) {
                    System.out.println(Thread.currentThread().getId() + " wait poll");
                    pro = false;
                    lock.wait();


                } else { res = this.que.poll();
                    System.out.println(" poll "); pro = false; }
        }
            res = this.que.poll();
            pro = false;
            System.out.println(Thread.currentThread().getId() + " poll");
            lock.notifyAll();
            con = true;
        }
        return res;
    }
}


