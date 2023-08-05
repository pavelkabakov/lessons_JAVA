package dz_12.task_2;

/**
 * 2.Взять реализованный код в рамках семинара 3, 4 или 5 и
 * продемонстрировать применение принципов, усвоенных на семинаре. Нужно в проекте прокомментировать
 * участки кода, которые рефакторим, какой принцип применяем и почему.
 *
 * взял код калькулятора
 * Что мы тут использовали
 * Принцип единственной ответственности: каждый класс занимается только своей задачей
 * Принцип разделения интерфейсов - для каждого класса свой интерфейс
 *
 */

public class CalculatorMain {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorController controller = new CalculatorController(model, view);

        String operation = view.getOperation();
        double num1 = view.getOperand();
        double num2 = view.getOperand();

        controller.perfomeOperation(operation, num1, num2);
    }
}
