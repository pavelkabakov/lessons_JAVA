package sem_10.Ex002;

public class Main {
    public static void main(String[] args) {

        Gen1<Integer, String> ob = new Gen1<>(88, "Тест");

        ob.showType();

        int v = ob.getOb1();

        System.out.println("Значение ob.v " + v);

        String str = ob.getOb2();

        System.out.println("Значение ob.str " + str);
    }
}
