package threads;


import javafx.scene.shape.Rectangle;

public class RectangleMove  implements Runnable {
    private final Rectangle rect;

    public RectangleMove(Rectangle rect) {
        this.rect = rect;
    }

    public boolean switc = true;
    private boolean switc2 = true;


    public void run() {

            while (switc) {
                if (!Thread.interrupted()) {
                    if ((rect.getX() < 300) && (switc)) {
                        this.rect.setX(this.rect.getX() + 1);
                    } else {
                        switc = false;
                        switc2 = true;
                        while (switc2) {
                            if (rect.getX() > 0) {
                                this.rect.setX(this.rect.getX() - 1);
                            } else {
                                switc = true;
                                switc2 = false;
                            }
                        }
                    }

                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {

                        switc = false;
                    }
                }
            }

    }
}




