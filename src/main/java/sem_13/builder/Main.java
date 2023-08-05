package sem_13.builder;

public class Main {
    public static void main(String[] args) {

        CarBuilder carBuilder1 = new CarBuilder();
        Car car1 = carBuilder1.setBrand("Toyota")
                .setModel("Camry")
                .setYear(2022)
                .setColor("Red")
                .build();

        // Создаем вторую машину без указания цвета
        CarBuilder carBuilder2 = new CarBuilder();
        Car car2 = carBuilder2.setBrand("Honda")
                .setModel("Accord")
                .setYear(2023)
                .build();

        System.out.println("Car 1: " + car1);
        System.out.println("Car 2: " + car2);
    }
}