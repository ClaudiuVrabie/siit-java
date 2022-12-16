package exceptions;

import java.util.List;
public class StudentManager {



    public void addStudent(Student student) {

            if (student.getFirstName() == "" || student.getLastName() == "") {
                System.out.println("You should introduce your full name.");
            }
            if (student.getYearOfBirth() < 1900) {
                System.out.println("You're too old to be a student.");
            }
             if (student.getYearOfBirth() > 2004) {
                System.out.println("You're age is under 18.");
            }
            if (Long.valueOf(student.getID()) == null) {
                System.out.println("You should introduce you're ID.");
            }
    }

    public void deleteStudent(long ID) {

        try {

         if(Long.valueOf(ID) == null)
             System.out.println("ID shouldn't be empty");
        }catch (NullPointerException exception) {
            System.out.println("ID is empty");
        }
    }

     public void retrieve(List<Student> studentList, int age) {

         try {

             for (Student student : studentList) {
                 age = student.getCurrentYear() - student.getYearOfBirth();
             }
             if (age < 0) {
                 throw new IllegalArgumentException("Input a valid age.");
             }
         } catch (NumberFormatException numberFormatException) {
             System.out.println("This is not a number.");
         }catch (IllegalArgumentException exeption){
             System.out.println(exeption.getMessage());
         }

     }


}




