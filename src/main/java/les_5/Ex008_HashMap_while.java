package les_5;

// Здесь мы снова создаем новый Hashmap и добавляем к нему несколько пар ключ-значение. Затем мы создаем
// новый объект Iterator с помощью метода entrySet(), который возвращает набор пар ключ-значение в виде
// объектов Map.Entry. Затем мы используем цикл while с методами hasNext() и next() для перебора набора
// и извлечения каждой пары ключ-значение. И наконец, мы извлекаем ключ и значение из каждого объекта
// Map.Entry и выводим их на консоль.

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex008_HashMap_while {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
