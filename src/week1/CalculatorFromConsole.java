package week1;

import java.util.Scanner;

public class CalculatorFromConsole {

    public static void main(String[] args) {

//        object to read input from console
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
//        make surse you ue relevant names for variables
        int firstNumber = sc.nextInt ();

        System.out.println("Enter the wanted operation to be executed");
//        String operation = sc.next();
        char operation = sc.next().toCharArray()[0];

        System.out.println("Enter second number");
        int secondNumber = sc.nextInt();

        switch (operation) {
            case '+' :
                System.out.println("Sum is: " + (firstNumber + secondNumber));
                break;
            case '-' :
                System.out.println("Difference is: " + (firstNumber - secondNumber));
                break;
            case '*' :
                System.out.println("Multiplier is: " + (firstNumber * secondNumber));
                break;
            case '/' :
                System.out.println("Division is: " + (firstNumber / secondNumber));
                break;
            default:
                System.out.println("Unknown operation");
        }
    }
}
