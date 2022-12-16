package week10.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Example2 {
    // WRITING WITH FILES
    // PAY ATTENTION TO .CLOSE() METHOD
    public static void main(String[] args) {
        String fileName = "src/week10/files/example2.txt";

        try {
            Writer writer = new FileWriter(fileName);
            BufferedWriter out = new BufferedWriter(writer);
            out.write("My text from Example2");

//            out.flush(); // only saves data, but doesn't close the resource
            System.out.println("File has been created successfully");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
