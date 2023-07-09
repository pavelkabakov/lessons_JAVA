package sem_6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// 1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
//2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент
// уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
//Для вычисления процента используйте формулу:
//процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
public class Ex002_HashSet {
    public static void main(String[] args) {
        task();
    }
    static void task(){
        System.out.println(unicPercent(createArr(100,0,24)));
    }
    static Integer[] createArr(int size, int min, int max){
        Integer[] arr = new Integer[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*(max-min+1)+min);
        }
        return arr;
    }

    static double unicPercent(Integer[] arr){
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        double percent = set.size() + 100.0 / arr.length;
        return percent;
    }

}
