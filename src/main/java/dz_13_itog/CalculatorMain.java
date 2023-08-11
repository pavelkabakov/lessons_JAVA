package dz_13_itog;

import les_2.Ex005_Logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Создать проект калькулятора комплексных чисел (достаточно сделать сложение, умножение и деление).
 * Применить при создании программы архитектурные паттерны, добавить логирование калькулятора.
 * Соблюдать принципы SOLID, паттерны проектирования.
 */

public class CalculatorMain {
    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger(CalculatorMain.class.getName());
        //ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler("log_Calculator.txt");
        //logger.addHandler(ch);
        logger.addHandler(fh);

        SimpleFormatter sFormat = new SimpleFormatter();
        //XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(sFormat);
        //fh.setFormatter(xml);

        //logger.setLevel(Level.INFO);
//        logger.log(Level.WARNING, "Тестовое логирование 1");
//        logger.info("Тестовое логирование 2");

        logger.info("Создание объекта model");
        CalculatorModel model = CalculatorModel.getInstance();
        logger.info("Создание объекта view");
        CalculatorView view = CalculatorView.getInstance();
        logger.info("Создание объекта controller");
        CalculatorPresenter controller = CalculatorPresenter.getInstance(model, view);


        String operation = view.getOperation();
        double num1 = view.getOperand();
        double num2 = view.getOperand();

        logger.info("Работа программы");
        try {
            controller.perfomeOperation(operation, num1, num2); // перехват исключения
        } catch (Exception exception){
            System.out.println(exception.getMessage());
            logger.log(Level.WARNING, exception.getMessage());
        }

    }
}
