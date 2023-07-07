package dz_4;
//Задание
//
//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
//Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди,
// не удаляя.
//Формат сдачи: файл с расширением java или ссылка на гит с подписанными ФИ и номером группы.
public class Ex001 {
    public static void main(String[] args) {
        ex001();
    }

    static void ex001(){
        MyQueue test_Queue = new MyQueue();
        test_Queue.enqueue(5);
        test_Queue.enqueue(7);
        test_Queue.enqueue(66);
        test_Queue.enqueue(234);
        test_Queue.enqueue(99);
        test_Queue.enqueue(8);
        test_Queue.enqueue(678);
        test_Queue.enqueue(25);
        test_Queue.print();
        System.out.println("первый элемент из очереди и удаляет его: " + test_Queue.dequeue());
        System.out.println("возвращает первый элемент из очереди: " + test_Queue.first());
        test_Queue.print();
        test_Queue.reverse();
        test_Queue.print();
        test_Queue.reverse();
        test_Queue.print();
    }
}
