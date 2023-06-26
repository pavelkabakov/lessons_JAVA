package sem_2;

import java.util.Arrays;

public class task_2 {
    public static void main(String[] args) {
        System.out.println(task1("aaaaaaaaabbbbbbbbbbbbbbbbcdddddddd"));
    }

    // Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd. Ds[jl a4b3c1d2
    static String task1(String str){
        /* Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd. Выход: a4b3c1d2*/
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i < chars.length ; i++) {
            if(chars[i] == chars[i-1]) count++;
            else {
                stringBuilder.append(chars[i-1]).append(count+1);
                count = 0;
            }
        }
        stringBuilder.append(chars[chars.length-1]).append(count+1);
        return stringBuilder.toString();
    }
}
