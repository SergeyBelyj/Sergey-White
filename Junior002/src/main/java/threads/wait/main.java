package threads.wait;

import com.sun.jndi.ldap.Connection;

import java.util.Queue;

public class main {
    public static void main(String[] args) {
        final Producer pro = new Producer();

        Thread tr1 = new Thread() {
            @Override
            public void run() {
                try {
                    pro.producer(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread tr2 = new Thread() {
            @Override
            public void run() {
                try {
                    pro.producer(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread pol = new Thread() {
            @Override
            public void run() {
                try {
                    pro.consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread pol2 = new Thread() {
            @Override
            public void run() {
                try {
                    pro.consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };



        tr1.start();
        pol2.start();
        tr2.start();
        pol.start();





    }
}
