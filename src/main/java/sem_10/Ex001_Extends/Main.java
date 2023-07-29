package sem_10.Ex001_Extends;

public class Main {
    public static void main(String[] args) {
        Gen<Integer> iob = new Gen<Integer>(88);

        iob.showType();

        int v = iob.getOb();

        System.out.println("Значение iob: " + v);

        Gen<String> sob = new Gen<>("Строка");

        sob.showType();

        String s = sob.getOb();

        System.out.println("Значение sob " + s);
    }
}
