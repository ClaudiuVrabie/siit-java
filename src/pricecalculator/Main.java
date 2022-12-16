package pricecalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


    Calculator calculator = new Calculator();

    Scanner scanner = new Scanner(System.in);

    System.out.println("Input the base price of the product:");
    double basePrice = scanner.nextDouble();

    System.out.println("Input the TVA of the product:");
    double TVA = scanner.nextDouble();

    System.out.println("The final price of the product is: " + calculator.calculatePrice(TVA, basePrice));


    }


}
