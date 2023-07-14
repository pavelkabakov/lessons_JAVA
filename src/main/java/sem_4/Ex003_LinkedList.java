package sem_4;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

// Реализовать консольное приложение, которое:
//
//1. Принимает от пользователя и “запоминает” строки.
//2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//3. Если введено revert, удаляет предыдущую введенную строку из памяти.
public class Ex003_LinkedList {
    public static void main(String[] args) {
    task0();
    }
    static void task0() {
        LinkedList<String> linked = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work) {
            System.out.println("Введите строку: ");
            String text = scanner.nextLine();
            text = text.trim();
            switch (text) {
                case "exit":
                    work = false;
                    break;
                case "revert":
                    linked.removeLast();
                    break;
                case "print":
                    ListIterator listIterator = linked.listIterator(linked.size());
                    while (listIterator.hasPrevious()) {
                        System.out.println(listIterator.previous());
                    }
                    break;
                default:
                    linked.add(text);
            }
        }
    }
}


