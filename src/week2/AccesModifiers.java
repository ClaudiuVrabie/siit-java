package week2;

public class AccesModifiers {
    public static void main(String[] args) {
        m1();

        m2();

    }

    // highest level of visibility
    public static void m1() {

    }

    // second level of visibility
    protected static void m4() {

    }

    //third level of visibility
    // missing keyword means default visibility
    static void m3() {

    }

    //lowest level of visibility
    private static void m2() {

    }

}
