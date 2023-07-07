package dz_4;

import java.util.LinkedList;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
//Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент
// из очереди, не удаляя.
public class MyQueue {
    //    private  Integer[] arr = new Integer[10];
    private int tmp = 0;
    private LinkedList<Integer> my_LL = new LinkedList<Integer>();

    void enqueue(int item) {
        my_LL.addLast(item);
    }

    int dequeue() {
        tmp = my_LL.peekFirst();
        my_LL.removeFirst();
        return tmp;
    }

    int first() {
        tmp = my_LL.getFirst();
        return tmp;
    }

    void print() {
        System.out.println(my_LL);
    }

    void reverse() {
        int my_LL_size = my_LL.size();
        for (int i = 0; i < my_LL_size; i++) {
            my_LL.addLast(my_LL.get(my_LL_size-i-1));
            my_LL.remove(my_LL_size-i-1);
        }
    }

}




