package objectcontainers;

import java.util.Comparator;

public class PersonComparatorByHeight implements Comparator {

    public int compare(Object o1, Object o2) {
        return (int) (((Person) o1).getHeight() - ((Person) o2).getHeight());}
    }

