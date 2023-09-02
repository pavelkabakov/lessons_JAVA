package Exception.dz_2.task_1;

/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает
 введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
 необходимо повторно запросить у пользователя ввод данных.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InputMismatchException {

        boolean flag = false;
        float number = 0;

        do try {
            number = inputFloat();
//            System.out.println("успешный ввод"); // for test
            flag = false;
        } catch (Exception e) {
            System.out.println("Вы ввели не число");
            flag = true;
        }
        while (flag);
        System.out.println("Вы ввели дробное число = " +  number);
    }

    private static float inputFloat() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дробное число (например \"36,6\")");
        float input = 0;
        try {
            input = scanner.nextFloat();
//            System.out.println("Вы ввели - " + input); // for test
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Вы ввели не число");
        }
        return input;
    }
}
