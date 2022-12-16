package week3.encapsulation;

public class Main {

    public static void main(String[] args) {

    Car c1 = new Car("ford");

    Car c2 = new Car("mercedes");

    Car c3 = new Car("audi");
    c3.setEngineType("V8");

    // making model property private in Car Class
    // this class cannot simply change the value
    // as used in previous example
    // c1.model -> does not compile

    //we use getter methods to obtain the property values
    System.out.println(c1.getModel());

    System.out.println(c3.getEngineType());

}
}
