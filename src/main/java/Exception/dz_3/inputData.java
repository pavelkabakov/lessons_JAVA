package Exception.dz_3;

import java.util.InputMismatchException;
import java.util.Scanner;


public class inputData {

    public String input() throws  InputMismatchException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свои данные, разделенные пробелом");
        System.out.println("Фамилию, имя и отчество, в формате: \"Фамилия Имя Отчество\"");
        System.out.println("дату рождения, в формате: \"dd.mm.yyyy\"");
        System.out.println("номер телефона в формате: \"999-123-45-67\"");
        System.out.println("Пол - в формате \"f\"(женский) или \"m\"(мужской)");
        System.out.println("например: \"Иванов Иван Иванович 01.01.2022 999-123-45-67 m\"");
        String input = null;
        try {
            input = scanner.nextLine();
            System.out.println("Вы ввели - " + input); // for test
        } catch (
                InputMismatchException e) {
            throw new InputMismatchException("Вы ввели не число");
        }
        return input;
    }

}

