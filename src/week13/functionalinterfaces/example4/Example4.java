package week13.functionalinterfaces.example4;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Example4 {
    public static void main(String[] args) {

        Predicate<String> p1 = str -> str.length() == 5;
        boolean b = p1.test("Hello");
        System.out.println(b);


//        BiPredicate

        BiPredicate<String, Integer> p2 = (str, n) -> str.length() == n;
        boolean b1 = p2.test("Claudiu", 6);
        System.out.println(b1);


    }
}
