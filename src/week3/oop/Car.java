package week3.oop;

public class Car {

    static int yearOfMake = 2000;

    String model;

    // constructor
    // no return type, name is Class name
    public Car(String modelReceived) {

        this.model = modelReceived;
    }

    //method
    public void drive(){
        System.out.println("I'm driving " + model);
    }

    // function
    public static void accelerate() {
        // cannot use non static fields or methods in static context
        // ex model or .drive() methods


        System.out.println(yearOfMake);
    }
}
