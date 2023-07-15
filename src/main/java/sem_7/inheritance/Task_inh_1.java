package sem_7.inheritance;

public class Task_inh_1 {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry");
        myCar.drive(); // Вывод: Driving a Toyota Camry
        myCar.honk(); // Вывод: Beep beep!

        Motorcycle myMotorcycle = new Motorcycle("Honda");
        myMotorcycle.ride(); // Вывод: Riding a Honda motorcycle
        myMotorcycle.honk(); // Вывод: Beep beep!

    }
}
// Базовый класс Vehicle
class Vehicle {
    protected String brand; // Защищенное поле brand

    public void honk() {
        System.out.println("Beep beep!");
    }
}

// Производный класс Car
class Car extends Vehicle {
    private String model; // Приватное поле model

    public Car(String brand, String model) {
        this.brand = brand; // Наследование поля brand из базового класса
        this.model = model;
    }

    public void drive() {
        System.out.println("Driving a " + brand + " " + model);
    }
}

// Производный класс Motorcycle
class Motorcycle extends Vehicle {
    public Motorcycle(String brand) {
        this.brand = brand; // Наследование поля brand из базового класса
    }

    public void ride() {
        System.out.println("Riding a " + brand + " motorcycle");
    }
}
