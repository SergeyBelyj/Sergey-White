package threads.nonBlocking;

import org.omg.PortableInterceptor.ServerRequestInfo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class NonBlock {
    private volatile boolean blockCustomer = true;

    public void doSomething() throws InterruptedException {
        while (this.blockCustomer) {
            System.out.println(String.format("%s usefull work", Thread.currentThread().getId()));

        }
    }

    public void setBlockCustomer(boolean blockCustomer) {
        System.out.println(String.format("%s enable", Thread.currentThread().getId()));
        this.blockCustomer = blockCustomer;
    }

    public static void main(String[] args) {
        NonBlock tr = new NonBlock();
        new Thread() {
            @Override
            public void run() {
                try {
                    tr.doSomething();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {

                    tr.blockCustomer = true;

            }
        }.start();
        List<String> syncList = Collections.synchronizedList(new ArrayList<String>());
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<String>();

    }
}
