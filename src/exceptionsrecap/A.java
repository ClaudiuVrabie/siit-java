package exceptionsrecap;

public class A {

    public static void main(String[] args) {

        try {
            System.out.println("Beginning of try");
// throw new RuntimeException();
// return;
            System.out.println("End of try");
        } catch (RuntimeException e) {
            System.out.println("Inside catch");
        } finally {
            System.out.println("Inside finally");
        }
    }
}
