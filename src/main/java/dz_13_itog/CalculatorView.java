package dz_13_itog;

import java.util.Scanner;

public class CalculatorView {

    private static CalculatorView instance;
    private Scanner scanner;

    private CalculatorView() {
        scanner = new Scanner(System.in);
    }

    // Singleton
    public static CalculatorView getInstance(){
        if (instance == null) {
            instance = new CalculatorView(){
            };
        }
        return instance;
    }

    public void displayResult(double result) {
        System.out.println("Результат: " + result);
    }

    public String getOperation() {
        System.out.println("Введите операцию:(+,-,*,/) ");
        return scanner.nextLine();
    }

    public double getOperand(){
        System.out.println("Введите число: ");
        return Double.parseDouble(scanner.nextLine());
    }
}
