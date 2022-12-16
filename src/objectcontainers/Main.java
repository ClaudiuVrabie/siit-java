package objectcontainers;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Ilan",1.75f);
        Person p2 = new Person("Ferdinand",1.89f);
        Person p3 = new Person("Vicentiu",1.99f);

        Set<Person> treeSet = new TreeSet<>(new PersonComparatorByName());

        treeSet.add(p1);
        treeSet.add(p2);
        treeSet.add(p3);

    for (Person p : treeSet){
        System.out.println(p);
    }


        List<Adress> adressList = new ArrayList<>();
        adressList.add(new Adress("M. Eminescu", 39));
        adressList.add(new Adress("Sos. Arcu", 44));



    List<Hobby> list = new LinkedList<>();

    list.add(new Hobby("swimming",2));
    list.add(new Hobby("climbying",1));
    list.add(new Hobby("cycling",3));


    System.out.println("--------------------------------------------------");


    Map<Person, String> hashMap = new HashMap<>();

    hashMap.put(p1, String.valueOf(list));

    for (Object o : hashMap.keySet()) {
        System.out.println(o);
    }

    for (Object o : hashMap.values()) {
            System.out.println(o);
    }
}
}
