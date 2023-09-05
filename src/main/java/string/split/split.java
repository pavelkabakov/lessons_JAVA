package string.split;

import java.util.regex.Pattern;

public class split {
    public static void main(String[] args) {

//        String input = "Hello Java! Hello JavaScript! JavaSE 8.";
//        Pattern pattern = Pattern.compile("[ ,.!?]");
//        String[] words = pattern.split(input);
//        for(String word:words)
//            System.out.println(word);



        String input = "Иванов Иван Иванович 01.01.2022 999-123-45-67 m";
        Pattern pattern = Pattern.compile("[ ]");
        String[] words = pattern.split(input);
        for(String word:words)
            System.out.println(word);
    }
}
