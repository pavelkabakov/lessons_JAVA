package les_5;

// В этом примере мы сначала создаем новый Hashmap и добавляем к нему несколько пар ключ-значение.
// Затем мы используем цикл for-each для итерации по Hashmap, извлекая каждую пару ключ-значение
// как объект Map.Entry. Затем мы извлекаем ключ и значение из каждого объекта Map.Entry и выводим
// их на консоль.

import java.util.HashMap;
import java.util.Map;

public class Ex007_HashMap_for_each {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
