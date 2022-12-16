package week3.oop;

public class Main {

    public static void main(String[] args) {

//        Integer.parseInt("2");
    // this is how we call a static method .accelerate() from Car !!!CLASS!!!
    Car.accelerate();
    // this is how we use a static variable from Car class
    System.out.println(Car.yearOfMake);

    // using new Car("ford") creates a new object of type Car
    // with the name c1
    Car c1 = new Car("ford");

    Car c2 = new Car("mercedes");

    // this is the first object

    System.out.println("This is c1 model " + c1.model);
    System.out.println("This is c1 year of make " + Car.yearOfMake);
    // this is how we call a non static method from c1 !!!OBJECT!!!
    c1.drive();

    // this is te second object

    System.out.println("This is c2 model " + c2.model);
    System.out.println("This is c2 year of make " + Car.yearOfMake);
    // this is how we call a non static method from c2 !!!OBJECT!!!
    c2.drive();
}


}
