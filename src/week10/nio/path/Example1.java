package week10.nio.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example1 {

    // NIO IS A BETTER ALTERNATIVE TO IO
    public static void main(String[] args) {
        // using Path interface we are able not care about the specific implementation of the path
        // WindowsPath & UnixPath
        Path p1 = Paths.get("a/b/c");
        // WINDOWS - C:\
        // LINUX - src/main

        System.out.println(p1);
        System.out.println(p1.getClass());

        Path p2 = Paths.get("a", "b", "c");
        System.out.println(p2);

    }
}
