package week1;

public class ReadFromCommandLine {
    public static void main(String[] args) {

        // read number given as command argument
        // for the first position -> 0
        int i = Integer.parseInt(args[0]);
        // read number given as command argument
        // for the second position -> 1
        int i1 = Integer.parseInt(args[1]);


        int sum = i / i1;

        // syntax to print out results
        System.out.println(sum);
    }
}
