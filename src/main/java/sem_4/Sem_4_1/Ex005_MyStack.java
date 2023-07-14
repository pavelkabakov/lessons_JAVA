package sem_4.Sem_4_1;
//// Реализовать стэк с помощью массива. Нужно реализовать методы:
////
////size(), empty(), push(), peek(), pop().

public class Ex005_MyStack {
    public static void main(String[] args) {
    stack();
    }
    static void stack(){
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        System.out.println(myStack.empty());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        System.out.println(myStack.size());

    }



}
