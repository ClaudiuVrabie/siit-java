package week13.lambda.example1;

public class Example1 {

    public static void main(String[] args) {

    // () -
    // ->  lambda syntax
    // after "->" - implementation of the abstract method
        Instrument i = () -> System.out.println("Piano implementation");

    // RECOMMENDATION
//        BE AWARE OF LIBRARIES OR FRAMEWORKS
//        THAT HAVE INTERFACES WITH ONLY ONE ABSTRACT METHOD
//        BUT DON'T HAVE THE @FunctionalInterface ANNOTATION PRESENT
//        THEY MIGHT CHANGE IN THE FUTURE AND YOUR CODE WILL FAIL TO COMPILE!!!!

//       AFTER JAVA 8
//        DEFAULT AND STATIC METHODS IN INTERFACES

    }
}
