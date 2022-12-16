package week3.inheritance;

public class Main { public static void main(String[] args) {



    // Animal is "parent" class
    // does not inherit
    System.out.println("----ANIMAL----");
    Animal animal = new Animal();
    animal.eat();


    // Dog inherits (via extends keyword)
    // behaviour from Animal class
    System.out.println("----DOG----");
    Dog dog = new Dog();
    dog.bark();
    dog.eat();


    // Golden Retriever (child class) inherits (via extends keyword)
    // behaviour from Dog class and also from Animal class
    System.out.println("----GOLDEN RETRIEVER----");
    GoldenRetriever goldenRetriever = new GoldenRetriever();
    goldenRetriever.retrieve();
    goldenRetriever.bark();
    goldenRetriever.eat();
}
}
