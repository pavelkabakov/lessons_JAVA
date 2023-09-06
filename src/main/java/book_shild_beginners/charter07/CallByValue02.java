package book_shild_beginners.charter07;
// Аргументы примитивных типов передаются по значению
class Test {
    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }
}
public class CallByValue02 {
    public static void main(String[] args) {
        Test ob = new Test();
        int a = 15, b = 20;
        System.out.println("a, b до вызова: " + a + ", " + b);

        ob.meth(a, b);
        System.out.println("a, b после вызова: " + a + ", " + b);
    }
}
/*
-------------------------------
a, b до вызова: 15, 20
a, b после вызова: 15, 20

в данном случае действия, выполняемые в теле метода meth(),
оказывают влияние на объект, указываемый в качестве арrумента.

Когда методу передается ссылка на объект, сама ссылка передается способом вызова по значению.
Но поскольку передаваемое значение ссылается на объект, то копия этого значения все
равно будет ссылаться на тот же самый объект, что и соответствующий аргумент.
 */