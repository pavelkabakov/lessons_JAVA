/* Это старый подход к обработке аргументов переменной длины!!! */

package book_shild_beginners.charter07;
// Использовать массив для передачи методу переменной количество аргументов.
public class UseArrayToPassVariableToMethod16 {
    static void vaTest(int v[]) {
        System.out.print("Количество аргументов: " + v.length + " Содержимое: ");
        for (int x: v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        // Обратите внимание на порядок создания массива для хранения аргументов
        int n1[] = { 10 };
        int n2[] = { 1, 2, 3 };
        int n3[] = { };
        vaTest(n1); // 1 аргумент
        vaTest(n2); // 3 аргумента
        vaTest(n3); // без аргументов
    }
}
/*
------------------------------------------
Количество аргументов: 1 Содержимое: 10
Количество аргументов: 3 Содержимое: 1 2 3
Количество аргументов: 0 Содержимое:
 */