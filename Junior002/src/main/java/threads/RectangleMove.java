package threads;


import javafx.scene.shape.Rectangle;

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
                    if ((rect.getX() < 300) && (rect.getX() > 0)) {
                        this.rect.setX(this.rect.getX() + step);
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    } else  {
                        this.rect.setX(this.rect.getX() - step);
                        step = step * -1;
                    }
                }
            }
        }



