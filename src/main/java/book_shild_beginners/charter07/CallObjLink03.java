package book_shild_beginners.charter07;
// Объекты передаются по ссылке на них.
class Test03 {
    int a, b;
    Test03 (int i, int j) {
        a = i;
        b = j;
    }

    // передать объект
    void meth (Test03 o) {
        o.a *= 2;
        o.b /= 2;
    }
}
public class CallObjLink03 {
    public static void main(String[] args) {
        Test03 ob = new Test03(15,20);
        System.out.println("ob.a, ob.b    до вызова: " + ob.a + ", " + ob.b);

        ob.meth(ob);
        System.out.println("ob.a, ob.b после вызова: " + ob.a + ", " + ob.b);
    }
}

/* ----------------------------
ob.a, ob.b    до вызова: 15, 20
ob.a, ob.b после вызова: 30, 10

Как видите, в данном случае действия, выполняемые в теле метода meth(),
оказывают влияние на объект, указываемый в качестве арrумента.

Когда методу передается ссылка на объект, сама ссылка передается способом вызова по значению.
Но поскольку передаваемое значение ссылается на объект, то копия этого значения все равно
будет ссылаться на тот же самый объект, что и соответствующий аргумент.
 */