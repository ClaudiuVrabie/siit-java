package week11.Example2;

// RUNNABLE <=> TASK
public class Example2 {

    public static void main(String[] args) {
        // task
        Runnable r1 = new OddNumbersRunnable();
        // thread
        Thread t1 = new Thread(r1, "T1");
        Thread t2 = new Thread(r1, "T2");

        t1.start();
        t2.start();

        System.out.println("END " +
                Thread.currentThread().getName());

    }
}
