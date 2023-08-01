package dz_11.Task1;

public class CalculatorModel {

    private double result;

    public void add(double num1, double num2) {
        result = num1 + num2;
    }

    public void subtract (double num1, double num2){
        result = num1 - num2;
    }

    public void divide(double num1, double num2) {
        try {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                // Обработка деления на ноль
                throw new Exception("На ноль делить нельзя!");
            }

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            result = 0;
        }
    }

    public void multiply (double num1, double num2){
        result = num1 * num2;
    }

    public double getResult() {
        return result;
    }

}
