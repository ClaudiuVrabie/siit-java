package demo;

public class Student {

    private String firstName;
    private String lastName;
    private float chemistry;
    private float math;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setStudentGrades(float chemistry, float math){
        this.math = math;
        this.chemistry = chemistry;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", chemistry=" + chemistry +
                ", math=" + math +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public float getChemistry() {
        return chemistry;
    }

    public float getMath() {
        return math;
    }
}
