package week10.files;

import java.io.*;

public class MyRecap {

    public static void main(String[] args) {

//        String file = "src/week10/files/recap.txt";
//
//   try {
//       Writer writer = new FileWriter(file);
//       BufferedWriter bufferedWriter = new BufferedWriter(writer);
//       bufferedWriter.write("Try now.");
//       System.out.println("File is ready to be departed");
//   }catch (IOException e){
//       throw new RuntimeException(e);
//   }

      String fileName = "src/week10/files/recap.txt";

   try(PrintWriter printer = new PrintWriter(fileName)){

       printer.println("My printed text");

   }catch (IOException e) {
       throw new RuntimeException(e);
   }
    }
}
