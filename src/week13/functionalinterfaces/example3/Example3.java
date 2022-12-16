package week13.functionalinterfaces.example3;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Example3 {

//    FUNCTION
    public static void main(String[] args) {

//      FUNCTION
        Function<String, Integer> f1 = (str) -> str.length();
        Integer i = f1.apply("Hi!");
        System.out.println(i);

//    BiFunction
        BiFunction<Integer, Integer, String> f2 = (n1, n2) -> n1 + " " + n2;
        String str = f2.apply(10, 20);
        System.out.println(str);
    }
}
