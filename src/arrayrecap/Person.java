package arrayrecap;

import java.util.Objects;

public class Person implements Comparable {

    private int age;
  private String name;

    @Override
    public String toString() {
       return "Person " + "name+ " +
               name + '\'';
    }

    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || o.getClass() != getClass()) return false;
        Person that = (Person) o;
        return Objects.equals(name, that.name);
    }

    public int hashCode() {
        return Objects.hash(name);}

    @Override
    public int compareTo(Object o) {
        return this.age - ((Person)o).age;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
  public String getName(){
        return name;
  }

  public void setName(String name){
        this.name = name;
  }
}
