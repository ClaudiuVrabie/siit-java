package week11.Example3;

public class DB2Runnable implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("DB2 querying ended!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
