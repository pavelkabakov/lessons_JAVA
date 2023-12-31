package sem_6;

import java.util.*;

//1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
// Распечатайте содержимое данного множества.
//2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
// Распечатайте содержимое данного множества.
//3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
// Распечатайте содержимое данного множества.
public class Ex001_HashSet {
    public static void main(String[] args) {
        programm();
    }

    static void programm(){
        Integer[] arr = new Integer[]{1, 2, 3, 11, 2, 9, 4, 5, 6, 3};
        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr));
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(arr));
        Set<Integer> set3 = new TreeSet<>(Arrays.asList(arr));

        System.out.println(set1); // [1, 2, 3, 4, 5, 6, 9, 11]
        System.out.println(set2); // [1, 2, 3, 11, 9, 4, 5, 6]
        System.out.println(set3); // [1, 2, 3, 4, 5, 6, 9, 11]
    }
}
