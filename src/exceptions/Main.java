package exceptions;


import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set<Student> studentList = new TreeSet<>(new StudentComparatorByLastName());

        Student student1 = new Student("", "Grivan","Male", 1999, 1990416234255L);
        Student student2 = new Student("Ioana","Cosanzeanu","Female",1997,19705116034805L);
        Student student3 = new Student("Eusebiu","Costan","Male",2005,205106116224209L);
        Student student4 = new Student("Fabian","Stan","Male",1989,289121216284244L);
        Student student5 = new Student("Isabel","Ion","Female",1994,194091104397867L);


        student1.addStudent(student1);
        student2.addStudent(student2);
        student3.addStudent(student3);
        student4.addStudent(student4);
        student5.addStudent(student5);


        student2.deleteStudent(19705116034805L);


        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student5);
        studentList.add(student3);
        System.out.println(studentList);

       student2.retrieve((List<Student>) studentList, 23);

     }

}

