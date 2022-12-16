package week7.generics.example9;

public class GenericsDemo9 {

    public static void main(String[] args) {
        A.doSomething(10, Integer.class);

        String myBean = A.getBean("i", String.class);

    }
}
