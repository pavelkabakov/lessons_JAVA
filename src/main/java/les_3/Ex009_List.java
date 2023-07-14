package les_3;

import java.util.ArrayList;
import java.util.List;

public class Ex009_List {
    public static void main(String[] args) {
        // Создаем новый список
        List<String> stringList = new ArrayList<>();

        // Добавляем несколько элементов в список
        stringList.add("India");
        stringList.add("UAE");
        stringList.add("London");
        stringList.add("US");

        // Печатаем первый элемент в списке
        System.out.println("First element: " + stringList.get(0)); // First element: India

        // Удаляем второй элемент из списка
        stringList.remove(1);

        // Печатаем второй элемент в списке
        System.out.println("Second element: " + stringList.get(1)); // Second element: London
    }
}
