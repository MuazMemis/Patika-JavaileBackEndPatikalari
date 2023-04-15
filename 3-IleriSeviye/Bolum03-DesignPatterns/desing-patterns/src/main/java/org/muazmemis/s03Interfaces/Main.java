package org.muazmemis.s03Interfaces;

public class Main {
    public static void main(String[] args) {
        TaxtCalculator calculator = getCalculator();
        float tax = calculator.calculateTax();
        System.out.println(tax);
    }

    public static TaxtCalculator getCalculator() {
        return new TaxCalculator2023();
    }
}
