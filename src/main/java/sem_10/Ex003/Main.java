package sem_10.Ex003;

public class Main {

    public static void main(String[] args) {

        Numeric<Integer> iob = new Numeric<>(5);

        System.out.println("Обратная величина = " + iob.reciprocal());
        System.out.println("дробная часть = " + iob.fraction());

        Numeric<Double> dob = new Numeric<>(5.25);

        System.out.println("Обратная величина = " + dob.reciprocal());
        System.out.println("дробная часть = " + dob.fraction());

//        Numeric<String> sob = new Numeric<>("String"); // выдает ошибку, так как тип Т ограничен классом Number

    }

}
