package dz_12.task_2;

public class CalculatorModel implements ICalculatorModel {

    private double result;

    @Override
    public void add(double num1, double num2) {
        result = num1 + num2;
    }

    @Override
    public void subtract(double num1, double num2){
        result = num1 - num2;
    }

    @Override
    public void divide(double num1, double num2) {
        if (num2 != 0) {
            result = num1 / num2;
        } else {
            // Обработка деления на ноль
            throw new IllegalArgumentException("На ноль делить нельзя!");
        }
    }

    @Override
    public void multiply(double num1, double num2){
        result = num1 * num2;
    }

    @Override
    public double getResult() {
        return result;
    }

}
