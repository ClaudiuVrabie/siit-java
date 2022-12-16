package week6.array.reference;

import week6.array.Hired;
import week6.array.Person;
import week6.array.Student;
import week6.array.Unemployed;

public class ArrayReferenceDemo2 {
    public static void main(String[] args) {

        Person[] personArray = {
                new Unemployed("Alex"),
                new Hired("Vlad"),
                new Student("Andrei")};

        for (int i = 0; i < personArray.length; i++) {
            System.out.println(personArray[i]);
        }
    }
}
