package week13.lambda.example1;

@FunctionalInterface
//acts like @override
//checks if there is ONLY one abstract method declared
public interface Instrument {

//   ONLY ONE ABSTRACT METHOD
//    to be a @FunctionalInterface
    public abstract void play();

    default void m1(){
//        still works - but don't be confused

        System.out.println("default");
    }

    static void m2(){
//        still works - but don't be confused
        System.out.println("static");
    }

}
