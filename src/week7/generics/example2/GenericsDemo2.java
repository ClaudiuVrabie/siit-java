package week7.generics.example2;

public class GenericsDemo2 {

    public static void main(String[] args) {

        A<Integer> a1 = new A<Integer>();
        A<String> a2 = new A<String>();

        //just a shortcut
        //java can determine that the effective type can only be a DOUBLE
        A<Double> a3 = new A<>();

    }
}
