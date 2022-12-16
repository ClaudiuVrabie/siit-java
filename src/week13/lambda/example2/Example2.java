package week13.lambda.example2;

public class Example2 {

    public static void main(String[] args) {

//       FOCUS ON THE LEFT SIDE
        X x1 = n -> System.out.println("Hi!");
        X x2 = (n) -> System.out.println("Hi!");
        X x3 = (int n) -> System.out.println("Hi!");
        X x4 = (var n) -> System.out.println("Hi!");

        Y y1 = (a, b) ->System.out.println("Hi!");
        Y y2 = (int a, int b) -> System.out.println("Hi!");
        Y y3 = (var a, var b) -> System.out.println("Hi!");

    }
}
