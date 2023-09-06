package Exception.dz_3;

import java.io.IOException;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) throws Exception {

        inputData inputData = new inputData();
        String input = inputData.input(); // для ручного ввода данных
//        String input = "Иванов Иван Иванович 01.01.2022 999-123-45-67 m"; // for test
//        String input = "Петров Петр Иванович 01.01.2022 999-123-45-67 m"; // for test
//        String input = "Сидоров Петр Иванович 01.01.2022 999-123-45-67 m"; // for test
//        String input = "Сидоров Василий Васильевич 01.01.2022 999-123-45-67 m"; // for test

        parseString parseString = new parseString();
        String[] words = parseString.splitString(input);
        boolean flag = false;


        do try {
//            System.out.println("Разбиваем на слова"); // for test
//            parseString.Print(words);// for test
            parseString.analiseInputData(words);
            saveInFile.writeToFile(input, words[0]);
            flag = false;
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода данных - " + e.getMessage());
        } catch (IOException e){
            System.out.println("Ошибка записи файла - " + e.getMessage());
        }
        while (flag);
        {
//            System.out.println(words.length);
            flag = true;

        }



    }
}





