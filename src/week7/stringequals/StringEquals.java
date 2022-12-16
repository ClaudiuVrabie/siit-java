package week7.stringequals;

public class StringEquals {

    public static void main(String[] args) {

        String s1 = "HELLO";  // created in String POOL
        String s2 = "HELLO";  // not created - but retrieved from String POOL
        String s3 = new String("HELLO");  // created in HEAP

        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s1 == s2);      // true
        System.out.println(s1 == s3);      // false

        System.out.println("---------------");
        Person p1 = new Person("Vlad");  // created in HEAP
        Person p2 = new Person("Vlad");  // created in HEAP
        System.out.println(p1.equals(p2));    // true - because equals is overridden
        System.out.println(p1 == p2);         // false
        System.out.println("---------------");


        String s4 = new String("HI");             // created in HEAP
        String s5 = new String("HI").intern();    // created in String POOL
        String s6 = "HI";                                // created in String POOL

        System.out.println(s4 == s5);     // false
        System.out.println(s5 == s6);     // true
        System.out.println(s4 == s6);     // false
    }
}
