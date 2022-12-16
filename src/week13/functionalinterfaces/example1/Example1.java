package week13.functionalinterfaces.example1;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Example1 {

    public static void main(String[] args) {

        Consumer<String> c1 = str -> System.out.println(str);
//        a lot of code can happen
        c1.accept("Hi!");

        BiConsumer<String, Integer> c2 = (s, n) -> System.out.println(s + " " + n);
        c2.accept("Hello", 10);

        Consumer<Integer> consumer = n -> System.out.println(n);
        List<Integer> list = List.of(10, 20, 30);
        list.forEach(consumer);

        Map<Integer, String> map = Map.of(10,"A", 20, "B", 30, "C");
        BiConsumer<Integer, String> biConsumer = (k, v) -> System.out.println(k + " " + v);
        map.forEach(biConsumer);
    }
}
