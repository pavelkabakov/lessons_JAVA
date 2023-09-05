package Exception.dz_3;

import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) throws Exception {

        inputData inputData = new inputData();
//        String input = inputData.input();
        String input = "Иванов Иван Иванович 01.01.2022 999-123-45-67 m"; // for test

        parseString parseString = new parseString();
        String[] words = parseString.splitString(input);
        boolean flag = false;


        do try {
//            System.out.println("Разбиваем на слова"); // for test
//            parseString.Print(words);// for test
            System.out.println(parseString.analiseInputData(words));
            flag = false;
        } catch (Exception e) {
            throw new InputMismatchException(e.getMessage());
        }
        while (flag); {
            System.out.println(words.length);
            flag = true;

        }

    }
}





