package dz_10.task_1;

/**
 Задача 1 : Напишите обобщенный метод printElement, который принимает один параметр типа T и выводит его на консоль.
 В этом примере мы объявляем обобщенный метод printElement, который принимает один параметр типа T. Мы просто выводим
 этот элемент на консоль с помощью метода System.out.println().
 В методе main мы вызываем Element с различными типами данных: целое число (Integer), строку (String) и число с
 плавающей запятой (Double). Компилятор автоматически выводит тип параметра T на основе переданных аргументов.
 Таким образом, обобщенные методы позволяют нам писать код, который может работать с различными типами данных,
 обеспечивая простоту и гибкость использования.
 */

public class Main {

    public static void main(String[] args) {
        Element element1 = new Element();
        Element element2 = new Element();
        Element element3 = new Element();


        element1.printElement(10);
        element2.printElement(25.568);
        element3.printElement("Test_String");

    }

}

