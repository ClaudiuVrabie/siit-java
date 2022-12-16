package objectcontainers;


import java.util.Objects;

public class Person {

    private String name;
   private float height;

    public Person(String name, float height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person that = (Person) o;
        return  height == that.height && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }


    public String getName() {
        return name;
    }

    public float getHeight() {
        return height;
    }
}

