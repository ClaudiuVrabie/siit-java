package arrayrecap;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String[] personArray = {
                String.valueOf(new Student("Laurian")),
                String.valueOf(new Unemployed("Cornel")),
                String.valueOf(new Hired("Victor"))
        };

    for(int i = 0; i < personArray.length; i++)
        System.out.println(personArray[i]);

        System.out.println("----------------------------------------");

    for (Object o : personArray)
        System.out.println(o);


    System.out.println("-----------------------------");

        ArrayList<Person> list = new ArrayList<>();
        list.add(new Hired("George"));
        list.add(new Unemployed("Lizuca"));
        list.add(new Hired("Patrocle"));

      for (Object i : list)
          System.out.println(i);

        System.out.println("---------------------");

        List<Person> linkedList = new LinkedList<>();
        linkedList.add(new Unemployed("Marius"));
        linkedList.add(new Student("Gicuta"));
        linkedList.add(new Hired("Falcao"));

    for (Object o : linkedList)
        System.out.println(o);


        Set<Person> hashSet = new HashSet<>();
        hashSet.add(new Unemployed("Jan"));

        System.out.println("------------------------------------------");

        Map<Integer, Person> map = new HashMap<>();
       map.put(1,new Unemployed("Sorin"));
       map.put(2, new Hired("Laura"));
       map.put(3, new Student("Cobzar"));


       for(Object o : map.keySet())
           System.out.println(o);

        System.out.println("--------------------------------------------");

    Set<Person> personSet = new TreeSet<>();
    personSet.add(new Student("Vip"));
    personSet.add(new Hired("Claudiu"));
    personSet.add(new Unemployed("Kevin"));


    for(Object o : personSet)
        System.out.println(o);

    }
}
