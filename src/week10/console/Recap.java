package week10.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Recap {

    public static void main(String[] args) {
//
//        InputStream input = System.in;
//        InputStreamReader inputStreamReader = new InputStreamReader(input);
//        BufferedReader bf = new BufferedReader(inputStreamReader);
//
//        try {
//            System.out.println("Enter a line");
//            String line = bf.readLine();
//
//            System.out.println("Line is: " + line);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//    var bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        try {
//            System.out.println("Enter your line: ");
////            String ln = bufferedReader.readLine();
//            System.out.println("Line is: " + bufferedReader.readLine());
//        }catch (IOException exception) {
//            throw new RuntimeException(exception);
//        }finally {
//            try {
//                if (bufferedReader != null){
//                    bufferedReader.close();
//                }
//            }catch (IOException exception){
//                throw new RuntimeException();
//            }
//        }
//
//        try(var buffer = new BufferedReader(new InputStreamReader(System.in)))
//        {
//            System.out.println("Enter the damn fucking line: ");
//            String damnfuckingline = buffer.readLine();
//            System.out.println("Damn fucking line is: " + damnfuckingline);
//        }catch (IOException exe){
//            throw new RuntimeException(exe);
//        }

  var buf = new BufferedReader(new InputStreamReader(System.in));

        try(buf) {
            System.out.println("Say something I'm not giving up on you: ");
            String something = buf.readLine();

            System.out.println("Motherfucker said: " + something);

    }catch (IOException exept){
            throw new RuntimeException(exept);
        }
}
}