package les_5;

// В данном примере мы снова создаем новый Hashmap и добавляем к ней несколько пар ключ-значение. Затем
// мы используем цикл for с методом keySet() для итерации по Hashmap, извлечения каждого ключа и
// использования его для получения соответствующего значения из Hashmap. Затем мы выводим ключ и
// значение на консоль.

import java.util.HashMap;

public class Ex009_Hashmap_for_loop {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
