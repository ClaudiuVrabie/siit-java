package week10.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Recap {

    public static void main(String[] args) {

        Path p1 = Paths.get("a/b/c");
        System.out.println(p1.getClass());
    }
}
