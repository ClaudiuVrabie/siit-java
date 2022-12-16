package week13.functionalinterfaces.example2;

import java.util.Random;
import java.util.function.Supplier;

public class Example2 {

//    SUPPLIER
    public static void main(String[] args) {

        Supplier<Integer> s1 = () -> new Random().nextInt(1000);

        Integer i = s1.get();
        System.out.println(i);
    }

}
