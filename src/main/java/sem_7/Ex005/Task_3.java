public class Task_3 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.drive();

    }
}
class Vehicle {
    protected String brand; // Защищенное поле brand

    protected void startEngine() { // Защищенный метод startEngine()
        System.out.println("Starting the engine of the vehicle.");
    }
}

class Car extends Vehicle {
    public void drive() {
        startEngine(); // Вызов защищенного метода startEngine()
        System.out.println("Driving the car.");
    }
}
