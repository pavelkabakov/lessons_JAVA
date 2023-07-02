package sem_3;
// Текст задачи:
// Заполнить список десятью случайными числами. Отсортировать
// список методом sort() и вывести его на экран.

import java.util.*;

public class Ex002 {

    public static void main(String[] args) {
        task1(createList(10, 0, 10));
    }

    static void task1(List<Integer> list) {
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
    }
    static List<Integer> createList(int size, int min, int max){
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add((int) (Math.random() * (max - min) + min));
        }
        return list;
    }

}
