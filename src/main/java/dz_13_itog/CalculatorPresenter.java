package dz_13_itog;

public class CalculatorPresenter {

    private static CalculatorPresenter instance;
    private CalculatorView view;
    private CalculatorModel model;

    private CalculatorPresenter(CalculatorModel model, CalculatorView view){
        this.model = model;
        this.view = view;
    }

    // Singleton
    public static CalculatorPresenter getInstance(CalculatorModel model, CalculatorView view){
        if (instance == null) {
            instance = new CalculatorPresenter(model, view){
            };
        }
        return instance;
    }

    public void perfomeOperation(String operation, double num1, double num2) throws Exception {
        switch (operation){
            case "+":
                model.add(num1, num2);
                break;
            case "-":
                model.subtract(num1,num2);
                break;
            case "*":
                model.multiply(num1,num2);
                break;
            case "/":
                model.divide(num1,num2);
                break;
            default:
                System.out.println("некорректная операция");
        }
        view.displayResult(model.getResult());
    }

}
