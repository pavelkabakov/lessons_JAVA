package sem_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

// Взять набор строк, например,
//
// Мороз и солнце день чудесный
// Еще ты дремлешь друг прелестный
// Пора красавица проснись.
//
// Написать метод, который отсортирует эти строки по длине с помощью TreeMap.
// Строки с одинаковой длиной не должны “потеряться”.
public class Ex004 {
    public static void main(String[] args) {
        System.out.println(task(" Мороз и солнце день чудесный\n" +
                "Еще ты дремлешь друг прелестный\n" +
                "Пора красавица проснись."));
    }

    static String task(String str){

        str = str.replace("/n", " ");
        str = str.replace(".", " ");
        String[] words = str.split(" ");
        Map<Integer, List<String>> map = new TreeMap<>();

        for (String word:
             words) {
            int len = word.length();
            if (map.containsKey(len)){
                List<String> list = map.get(len);
                list.add(word);
            }
            else {
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(len, list);
            }

        }
        return map.toString();
    }
}
