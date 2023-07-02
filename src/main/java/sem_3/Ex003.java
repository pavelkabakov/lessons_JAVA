package sem_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Создать список типа ArrayList<String>. Поместить в него как строки,
// так и целые числа. Пройти по списку, найти и удалить целые числа.
public class Ex003 {
    public static void main(String[] args) {
        task2();

    }
    static  void task2(){
        List list = new ArrayList();
        list.add("list");
        list.add(77);
        list.add(66);
        list.add("hello");
        list.add(22);
        list.add("word");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object o = iterator.next();
            if(o instanceof Integer){
                iterator.remove();
            }
        }
        System.out.println(list);
    }

}
