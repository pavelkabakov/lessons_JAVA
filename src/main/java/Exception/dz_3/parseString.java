package Exception.dz_3;

import java.util.InputMismatchException;
import java.util.regex.Pattern;

public class parseString {

    public static String[] splitString(String input) {
        Pattern pattern = Pattern.compile("\s");
        String[] words = pattern.split(input);
//        for (String word:words) System.out.println(word);
        return words;
    }

    public static void Print(String[] words) {
        for (String word : words)
            System.out.println(word);
    }

    /**
     *
     * @param words
     * @return
     * @throws InputMismatchException
     */
    public static void analiseInputData(String[] words) throws InputMismatchException {
        try {
            if (words.length != 6) {
                throw new InputMismatchException("Введены неправильные данные");

            }
            for (String word : words) {
                System.out.println(word);
                if (!analiseName(word) & !analiseBirthday(word) & !analiseGender(word) & !analisePhoneNumber(word)) {
                    throw new InputMismatchException("Введены неправильные данные");
                }
            }

        } catch (InputMismatchException e) {
            throw new InputMismatchException(e.getMessage());
        }

    }

    public static boolean analiseName(String input) {
        boolean result = input.matches("[а-яёА-ЯЁ]+");
        if (result) {
//            System.out.println("это фамилия");//for test
            return true;
        } else {
//            System.out.println("это не фамилия!");//for test
            return false;
        }

    }

    public static boolean analisePhoneNumber(String input) {

        boolean result = input.matches("([0-9]{3})(\\-)([0-9]{3})(\\-)([0-9]{2})(\\-)([0-9]{2})");
        if (result) {
//            System.out.println("это телефонный номер");//for test
            return true;
        } else {
//            System.out.println("это не телефонный номер!");//for test
            return false;
        }

    }

    public static boolean analiseBirthday(String input) {

        boolean result = input.matches("([0-9]{2})(\\.)([0-9]{2})(\\.)([0-9]{4})");
        if (result) {
//            System.out.println("это дата");//for test
            return true;
        } else {
//            System.out.println("это не дата!");//for test
            return false;
        }
    }

    public static boolean analiseGender(String input) {
        boolean result = input.matches("[f,m]");
        if (result) {
//            System.out.println("это пол");//for test
            return true;
        } else {
//            System.out.println("это не пол!");//for test
            return false;
        }
    }

}
