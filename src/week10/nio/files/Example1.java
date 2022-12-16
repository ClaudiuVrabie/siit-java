package week10.nio.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example1 {

    //CREATING A FILE
    public static void main(String[] args) throws IOException {

        String fileName = "src/week10/nio/files/Example1.txt";
        Path p1 = Paths.get(fileName);

        // creating a file without writing in it
        Files.createFile(p1);

    }
}
