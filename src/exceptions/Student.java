package exceptions;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Objects;

public class Student extends StudentManager {

  private String firstName;
  private String lastName;
  private String gender;
  private int yearOfBirth;
  private long ID;

  private final int currentYear = 2022;

    public Student(String firstName, String lastName, String gender, int yearOfBirth, long ID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.yearOfBirth = yearOfBirth;
        this.ID = ID;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return yearOfBirth == student.yearOfBirth && ID == student.ID && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(gender, student.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, gender, yearOfBirth, ID);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", ID=" + ID +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getYearOfBirth() {
        return yearOfBirth;
    }
    public long getID() {
        return ID;
    }
    public int getCurrentYear() {
        return currentYear;
    }
}


