package exceptionsrecap;

import java.io.*;


public class B {

    public static void main(String[] args) throws IOException {

        String fileName = "src/exceptionsrecap/example";
        BufferedReader r = new BufferedReader(new FileReader(fileName));

        try{
            String firstLine = r.readLine();
            System.out.println(firstLine);
            System.out.println();
        }catch(IOException e){
           throw new RuntimeException(e);
        }
        finally {
           r.close();
        }
    }
}
