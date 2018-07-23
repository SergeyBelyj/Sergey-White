package threads;


import javafx.scene.shape.Rectangle;

    public class RectangleMove implements Runnable {
        private final Rectangle rect;

        public RectangleMove(Rectangle rect) {
            this.rect = rect;
        }


        @Override
        public void run() {
            while (true) {
                    if (rect.getX() < 300) {
                        this.rect.setX(this.rect.getX() + 10);
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        while (rect.getX() > 0) {
                            this.rect.setX(this.rect.getX() - 10);
                            try {
                                Thread.sleep(50);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }



