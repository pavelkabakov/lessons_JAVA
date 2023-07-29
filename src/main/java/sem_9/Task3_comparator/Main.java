package sem_9.Task3_comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// compare(T o1, T o2)

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3); // создаем список целых чисел

        // Используем компаратор для сортировки в порядке возрастания
        numbers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                return num1 - num2;
            }
        });

        System.out.println(numbers); // Вывод: [1, 2, 3, 5, 8]
    }
}