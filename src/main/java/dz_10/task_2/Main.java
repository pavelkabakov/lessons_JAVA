package dz_10.task_2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 Задача 2 : Напишите обобщенный метод printArray, который принимает массив любого типа и выводит его элементы на
 консоль.
 В этом примере мы объявляем обобщенный метод printArray, который принимает массив типа T. Затем мы используем цикл
 for-each, чтобы пройти по всем элементам массива и вывести их на консоль.
 В методе main мы создаем массивы типов Integer и String и вызываем printArray для каждого из них. В результате мы
 получаем вывод на консоль элементов каждого массива.
 Таким образом, обобщенные методы позволяют нам создавать код, который может работать с разными типами данных,
 обеспечивая повторное использование и гибкость.
 Полезные материалы
 https://metanit.com/java/tutorial/3.11.php
 *
 */

public class Main {
    public static void main(String[] args) {

        Integer[] nums = {1, 2, 3, 55, 88};
        String[] strings = {"строка1", "строка2", "строка3", "строка4"};

        myArray array1 = new myArray();

        array1.printArray(nums);
        array1.printArray(strings);

    }
}
