package week10.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example6 {
    // BEWARE OF THIS
    public static void main(String[] args) {
        var bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try (bufferedReader) {
            System.out.println("Enter your line");
            String line = bufferedReader.readLine();

            System.out.println("LINE: " + line);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // bufferedReader RESOURCE is closed here
    }
}
