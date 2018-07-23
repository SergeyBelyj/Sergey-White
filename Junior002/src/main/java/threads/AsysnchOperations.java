package threads;


import static java.lang.Character.toUpperCase;

public class AsysnchOperations {
    private static int key = 0;

    public static final class Exampl implements Runnable{
    private final String name;

    public Exampl(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(AsysnchOperations.key + 4 +  " " + this.name);
    }
}
    public static final class Exampl2 implements Runnable{
        private final String name;

        public Exampl2(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            key++;
            System.out.println(AsysnchOperations.key + " " + this.name);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println(key);
        new Thread(new Exampl("1")).start();
        new Thread(new Exampl2("2")).start();
        Thread.sleep(1000);
        System.out.println(key);
    }
}





