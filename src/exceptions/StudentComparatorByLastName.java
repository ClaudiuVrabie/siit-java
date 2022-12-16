package exceptions;

import java.util.Comparator;

public class StudentComparatorByLastName implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
            return ((Student) o1).getLastName().compareTo(((Student) o2).getLastName());
    }
}