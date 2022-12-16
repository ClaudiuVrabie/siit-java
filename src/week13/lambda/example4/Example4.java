package week13.lambda.example4;

import java.util.function.Function;

//BUILT IN INTERFACE FROM JAVA
public class Example4 {

    public static void main(String[] args) {
//        x -> y (encoding) "ABCD" -> "DCBA"

        Reverse r1 = str -> new StringBuilder(str).reverse().toString();
        System.out.println(r1.reverse("ABCD"));

        Function<String, String> f1 = str -> new StringBuilder(str).reverse().toString();
        System.out.println(f1.apply("ABCD"));
    }
}
