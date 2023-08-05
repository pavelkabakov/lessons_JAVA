package dz_12.task_2;

import java.util.Scanner;

public class CalculatorView implements ICalculatorView {

    private Scanner scanner;

    public CalculatorView() {
        scanner = new Scanner(System.in);
    }

    @Override
    public void displayResult(double result) {
        System.out.println("Результат: " + result);
    }

    @Override
    public String getOperation() {
        System.out.println("Введите операцию:(+,-,*,/) ");
        return scanner.nextLine();
    }

    @Override
    public double getOperand(){
        System.out.println("Введите операнд (число): ");
        return Double.parseDouble(scanner.nextLine());
    }
}
