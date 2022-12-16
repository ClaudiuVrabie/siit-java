package week13.functionalinterfaces.example5;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Example5 {


//    UNARY OPERATOR
    public static void main(String[] args) {


        UnaryOperator<Integer> u1 = n -> n + 1;
        Integer i1 = u1.apply(10);
        System.out.println(i1);

        UnaryOperator<String> u2 = str -> new StringBuilder(str).reverse().toString();
        String s1 = u2.apply("XYZ");
        System.out.println(s1);

//        Binary Operator

        BinaryOperator<Integer> b1 = (n1, n2) -> n1 + n2;
        System.out.println(b1.apply(10,20));

        BinaryOperator<String> b2 = (str1, str2) -> str1 + str2;
        System.out.println(b2.apply("ABCD", "EFGH"));
    }
}
