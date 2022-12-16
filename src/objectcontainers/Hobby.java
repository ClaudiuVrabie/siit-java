package objectcontainers;

import java.util.Objects;

public class Hobby  {

    private String hobbyName;

    private int frequency;

    public Hobby(String hobbyName, int frequency) {
        this.hobbyName = hobbyName;
        this.frequency = frequency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hobby hobby = (Hobby) o;
        return frequency == hobby.frequency && Objects.equals(hobbyName, hobby.hobbyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hobbyName, frequency);
    }

    @Override
    public String toString() {
        return "hobby='" + hobbyName + '\'' +
                ", frequency=" + frequency +
                '}';
    }

}
