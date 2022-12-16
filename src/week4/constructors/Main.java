package week4.constructors;

public class Main {
    public static void main(String[] args) {

        LivingBeing lv = new Person();
        // implicit constructor is being used
        ImplicitConstructor ic = new ImplicitConstructor();

        // uses explicit constructor
        Person p1 = new Person();

        Person p2 = new Person("Vlad");


        Person p3 = new Person();




    }
}
