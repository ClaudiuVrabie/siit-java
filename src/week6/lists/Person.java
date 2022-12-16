package week6.lists;

import java.util.Objects;

public abstract class Person {

    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }



    @Override
    public String toString(){
        return "Person {" +
                "name='" + name + '\'' + '}'
                ;

    }
    public static void main(String[] args) {


        Person student = new Student("Cristi");

        Person hired = new Hired("Ambrozie");



    }
}