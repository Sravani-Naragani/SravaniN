package com.infinite.exam;

public class Examinol {
    public static void main(String[] args) {
        double num1 = 5.0;
        double num2 = 2.0;
        printOperation(num1, num2, "addition");
    }

    public static void printOperation(double num1, double num2, String operation) {
        switch (operation) {
            case "addition":
                System.out.println("Sum: " + (num1 + num2));
                break;
            case "difference":
                System.out.println("Difference: " + (num1 - num2));
                break;
            case "multiplication":
                System.out.println("Product: " + (num1 * num2));
                break;
            default:
                System.out.println("Invalid operation selected.");
                break;
        }
    }

    public static void printOperation(double num1, double num2, double num3, String operation) {
        switch (operation) {
            case "addition":
                System.out.println("Sum: " + (num1 + num2 + num3));
                break;
            case "difference":
                System.out.println("Difference: " + (num1 - num2 - num3));
                break;
            case "multiplication":
                System.out.println("Product: " + (num1 * num2 * num3));
                break;
            default:
                System.out.println("Invalid operation selected.");
                break;
        }
    }
}
