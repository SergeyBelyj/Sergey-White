package threads;


import javafx.scene.shape.Rectangle;
import sun.awt.windows.ThemeReader;

public class RectangleMove implements Runnable {
        private final Rectangle rect;

        public RectangleMove(Rectangle rect) {
            this.rect = rect;
        }


        @Override
        public void run() {
            int step = 10;
            boolean deltaY = false;
            while (!Thread.interrupted()) {
                try {

                    if ((rect.getX() < 300) && (rect.getX() > 0)) {
                        this.rect.setX(this.rect.getX() + step);
                        Thread.sleep(50);
                        Thread.currentThread().interrupt();

                    } else {
                        this.rect.setX(this.rect.getX() - step);
                        Thread.sleep(50);
                        step = step * -1;
                    }
                } catch (Exception e) {
                    e.getStackTrace();
                }
                }
            }
        }



