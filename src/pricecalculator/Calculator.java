package pricecalculator;

public class Calculator {

    public double calculatePrice(double TVA, double basePrice) {
        double finalPrice = basePrice + (basePrice * (TVA / 100));
        return finalPrice;
    }
}
