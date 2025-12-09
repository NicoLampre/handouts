package it.unimi.di.prog2.h07;

public class MathFunctionsClient {
    public static void main(String[] args) {
        double[] testValues = { 4.0, 0.0, 2.0, -1.0, 9.0, 16.0, 0.25 };
        for (double value : testValues) {
            try {
                double result = MathFunctions.sqrt(value);
                System.out.printf("sqrt(%.2f) = %.5f%n", value, result);
            } catch (IllegalArgumentException e) {
                System.out.printf("sqrt(%.2f) is undefined: %s%n", value, e.getMessage());
            }
        }
    }
}
