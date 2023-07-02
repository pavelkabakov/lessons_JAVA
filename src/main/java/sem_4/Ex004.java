package sem_4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// Работа со стеком и очередью
//1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль
// содержимое стэка.
//2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль
// содержимое очереди.
public class Ex004 {
    public static void main(String[] args) {
        task0();
    }

    static void task0 (){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.add(6);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
