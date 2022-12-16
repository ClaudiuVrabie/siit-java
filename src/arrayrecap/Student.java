package arrayrecap;

public class Student extends Person {


    private String name;

    public Student(String name){
        this.name = name;
    }

     public String toString(){
        return "Student " + "name = '" +
                name + '\'';
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
