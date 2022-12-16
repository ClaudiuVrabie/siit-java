package week7.generics.example8;

public class GenericsDemo8 {

    public static void main(String[] args) {
        A<Integer> a1 = new A<>();
        int a = a1.doSomething(10);

        I<String> a2 = new A<>();

        String s = a2.doSomething("abcd");

//        I<Integer> a3 = new B(); ->compilation error
    }
}
