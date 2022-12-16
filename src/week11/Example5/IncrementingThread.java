package week11.Example5;

import static week11.Example5.Main.number;

public class IncrementingThread implements Runnable {

    @Override
    public void run() {
        try {
            while (true) {
                number++; // changing the value
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
