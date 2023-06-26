package les_1;

public class les_1 {
    public static void main(String[] args) {
        // ----- типы данных -----
        // short age = 10;
        // int salary = 123456;
        // System.out.println(age); //10
        // System.out.println(salary); //123456

        // char ch = '1';
        // System.out.println(Character.isDigit(ch)); // true
        // ch = 'a';
        // System.out.println(Character.isDigit(ch)); // false

        // float e = 2.7f;
        // double pi = 3.1415;
        // System.out.println(e); // 2.7
        // System.out.println(pi); // 3.1415

        // boolean flag1 = 123 <= 234;
        // System.out.println(flag1); // true
        // boolean flag2 = 123 >= 234 || flag1;
        // System.out.println(flag2); // true
        // boolean flag3 = flag1 ^ flag2;
        // System.out.println(flag3); // false

        // -------- СТРОКИ ---------------
        // String msg ="Hello world";
        // System.out.println(msg); // Hello world

        // ------- Неявная типизация -------
        // var a = 123;
        // System.out.println(a); // 123
        // var d = 123.456;
        // System.out.println(d); // 123.456
        // System.out.println(getType(a)); // Integer
        // System.out.println(getType(d)); // Double
        // d = 1022;
        // System.out.println(d); // 1022
        //d = "mistake";
        //error: incompatible types:
        //String cannot be converted to double

        // -------- Массивы -----------
        // ---- Одномерные ----
        // int[] arr = new int[10];
        // System.out.println(arr.length); // 10
        // arr = new int[] { 1, 2, 3, 4, 5 };
        // System.out.println(arr.length); // 5

        // --- Многомерные -----
        // int[] arr[] = new int[3][5];
        // for (int[] line : arr) {
        // for (int item : line) {
        // System.out.printf("%d ", item);
        // }
        // System.out.println();
        // }

        // ------ Преобразования ------
        // int i = 123; double d = i;
        // System.out.println(i); // 123
        // System.out.println(d); // 123.0
        // d = 3.1415; i = (int)d;
        // System.out.println(d); // 3.1415
        // System.out.println(i); // 3
        // d = 3.9415; i = (int)d;
        // System.out.println(d); // 3.9415
        // System.out.println(i); // 3
        // byte b = Byte.parseByte("123");
        // System.out.println(b); // 123
        // b = Byte.parseByte("1234");
        // System.out.println(b); // NumberFormatException: Value out of range

        // int[] a = new int[10];
        // double[] d = a; // ИЗУЧАЕМ ковариантность и контравариантность
        // System.out.println(d);

        // ---- Получение данных из терминала ----
        // --- Строки ---
        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("name: ");
        // String name = iScanner.nextLine();
        // System.out.printf("Привет, %s!", name);
        // iScanner.close();

        // ---- Некоторые примитивы ----
        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("int a: ");
        // int x = iScanner.nextInt();
        // System.out.printf("double a: ");
        // double y = iScanner.nextDouble();
        // System.out.printf("%d + %f = %f", x, y, x + y);
        // iScanner.close();

        // ---- Проверка на соответствие получаемого типа -----
        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("int a: ");
        // boolean flag = iScanner.hasNextInt();
        // System.out.println(flag);
        // int i = iScanner.nextInt();
        // System.out.println(i);
        // iScanner.close();

        // ------ Форматированный вывод ------
        // int a = 1, b = 2;
        // int c = a + b;
        // String res = a + " + " + b + " = " + c;
        // System.out.println(res);
        // ------ еще Форматированный вывод ------
        // int a = 1, b = 2;
        // int c = a + b;
        // String res = String.format("%d + %d = %d \n", a, b, c);
        // System.out.printf("%d + %d = %d \n", a, b, c);
        // System.out.println(res);

        // Виды спецификаторов
        // %d: целочисленных значений
        // %x: для вывода шестнадцатеричных чисел
        // %f: для вывода чисел с плавающей точкой
        // %e: для вывода чисел в экспоненциальной форме,
        // например, 3.1415e+01
        // %c: для вывода одиночного символа

        // %s: для вывода строковых значений

        float pi = 3.1415f;
        System.out.printf("%f\n", pi); // 3,141500
        System.out.printf("%.2f\n", pi); // 3,14
        System.out.printf("%.3f\n", pi); // 3,141
        System.out.printf("%e\n", pi); // 3,141500e+00
        System.out.printf("%.2e\n", pi); // 3,14e+00
        System.out.printf("%.3e\n", pi); // 3,141e+00



    }
    static String getType(Object o){
        return o.getClass().getSimpleName();
    }
}
