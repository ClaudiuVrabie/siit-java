package demo;

import java.util.ArrayList;
import java.util.List;

public class StudentList {


    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        Student student1 = new Student("Mihai", "Petru");
        Student student2 = new Student("Andrei", "Costache");

        student2.setStudentGrades(5.7f, 9.6f);
        student1.setStudentGrades(6.8f,7);


        studentList.add(student1);
        studentList.add(student2);

        System.out.println(studentList);
    }
}
