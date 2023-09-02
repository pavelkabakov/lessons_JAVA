package book_shild_beginners.charter11.Package05;

// Пример синхронизированной программы
class Callme {

    // Этот метод принимает параметр msg типа String и пытается вывести символьную строку в квадратных скобках
    synchronized void call(String msg) {
        System.out.print("[" + msg);
        // после того, как метод call() выведет символьную строку,
        // он вызывает метод Thread.sleep(1000) и приостанавливает текущий поток исполнения на 1 секунду
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("прервано");
        }
        System.out.println("]");
    }
}

class Caller implements Runnable {
    String msg;
    Callme target;
    Thread thr;

    // В этом конструкторе создается также новый поток исполнения,
    // в котором вызывается метод run() для данного объекта.
    public Caller(Callme trg, String s) {
        target = trg;
        msg    = s;
        thr    = new Thread(this);
        thr.start();
    }
    public void run() {
        target.call(msg);
    }
}

class Synch {
    public static void main(String[] args) {
        Callme target = new Callme();
        Caller obj1    = new Caller(target, "obj1");
        Caller obj2    = new Caller(target, "obj2");
        Caller obj3    = new Caller(target, "obj3");

        // ожидать завершения потока исполнения
        try {
            obj1.thr.join();
            obj2.thr.join();
            obj3.thr.join();
        } catch (InterruptedException e) {
            System.out.println("прервано");
        }
    }
}
/*
  Метод call() принимает параметр msg типа String и пытается вывести символьную строку в квадратных скобках.
Gосле того, как метод call() выведет символьную строку, он вызывает метод Thread.sleep(1000)
и приостанавливает текущий поток исполнения на 1 секунду.
  Конструктор следующего класса, Caller, принимает ссылку на экземпляры классов Callme и String,
которые сохраняются в переменных target и msg.
  В этом конструкторе создается также новый поток исполнения, в котором вызывается метод run() для данного объекта.
Этот поток запускается немедленно. В методе run() из класса Caller вызывается метод call() для экземпляра target класса Callme,
передавая ему символьную строку msg.
  И наконец, класс Synch начинается с создания единственного экземпляра класса Callme и трех экземпляров класса Caller
с отдельными строками сообщения. Один и тот же экземпляр класса Callme передается каждому конструктору Caller().
  Благодаря вызову метода sleep() из метода call() удается переключиться на исполнение другого потока. Это приводит к смешанному
выводу трех строк сообщений. В данной программе отсутствует механизм, предотвращающий одновременный вызов в потоках исполнения
одного и того же метода для того же самого объекта, поскольку три потока соперничают за окончание метода.

Результат выполнения данной программы:
------------------------------------------
[obj1[obj2[obj3]
]
]

Добавим к методу call() ключевое слово synchronized, чтобы предотвратить доступ к методу call() из других потоков исполнения,
когда он уже используется в одном потоке.

Результат выполнения данной программы:
------------------------------------------
[obj1]
[obj3]
[obj2]

*/