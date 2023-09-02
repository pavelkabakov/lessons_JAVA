package Exception.dz_2.task_4;

/*
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
 Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InputMismatchException {

        boolean flag = false;
        String str = null;

        do try {
            str = inputString();
//            System.out.println("успешный ввод"); // for test
            flag = false;
        } catch (Exception e) {
            System.out.println("Пустые строки вводить нельзя");
            flag = true;
        }
        while (flag);
        System.out.println("Вы ввели строку = " +  str);
    }

    private static String inputString() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = null;
        try {
            str = scanner.nextLine();
            if (str.equals("")) {
                throw new InputMismatchException("Вы ввели пустую строку");
            }
//            System.out.println("Вы ввели - " + input); // for test
        }catch (InputMismatchException e){
            throw new InputMismatchException(e.getMessage());
        } catch (Exception e) {

            throw new Exception("Что то пошло не так");

        }
        return str;
    }
}
