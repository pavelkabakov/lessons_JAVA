package dz_12.task_2;

public class CalculatorController implements ICalculatorController {

    private CalculatorView view;
    private CalculatorModel model;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void perfomeOperation(String operation, double num1, double num2) {
        switch (operation) {
            case "+":
                model.add(num1, num2);
                break;
            case "-":
                model.subtract(num1, num2);
                break;
            case "*":
                model.multiply(num1, num2);
                break;
            case "/":
                model.divide(num1, num2);
                break;
            default:
                System.out.println("некорректная операция");
        }
        view.displayResult(model.getResult());
    }

}
