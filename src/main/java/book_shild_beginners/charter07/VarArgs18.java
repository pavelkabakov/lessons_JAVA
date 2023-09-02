package book_shild_beginners.charter07;
//Использовать аргументы переменной длины вместе со стандартными аргументами
class VarArgs18 {
    // msg - обычный параметр
    // v - параметр переменной длины
    static void vaTest(String msg, int ... v) {
        System.out.print(msg + v.length + " Содержимое: ");
        for (int x : v) System.out.print(x +  " ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("Один параметр переменной длины: ", 10);
        vaTest("Три параметра переменной длины: ", 1, 2, 3);
        vaTest("Без параметров переменной длины: ");
    }
}
/* ------------------------------------------------
Один параметр переменной длины: 1 Содержимое: 10
Три параметра переменной длины: 3 Содержимое: 1 2 3
Без параметров переменной длины: 0 Содержимое:
 */