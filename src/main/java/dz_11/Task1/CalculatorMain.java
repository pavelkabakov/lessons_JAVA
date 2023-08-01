package dz_11.Task1;

/**
 * Конструируем калькулятор, применяя архитектуру MVP (Model-View-Presenter), с возможностью выполнения
 * базовых математических операций, таких как сложение, вычитание, умножение и деление, работающий
 * с дробными числами.
 * Доп. Задача (*) Мы также обеспечим обработку возможных ошибок, чтобы предотвратить некорректные операции.
 */

public class CalculatorMain {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorPresenter controller = new CalculatorPresenter(model, view);

        String operation = view.getOperation();
        double num1 = view.getOperand();
        double num2 = view.getOperand();

        controller.perfomeOperation(operation, num1, num2);
    }
}
