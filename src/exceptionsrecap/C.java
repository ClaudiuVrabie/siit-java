package exceptionsrecap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class C {

    public static void main(String[] args){

        String file = "src/exceptionsrecap/C.txt";


        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = reader.readLine();


    } catch (IOException e) {
          System.out.println( e.getMessage());}



    }
}
