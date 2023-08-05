package sem_13.builder;

// Продукт
class Car {
    private String brand;
    private String model;
    private int year;
    private String color;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car: " + brand + " " + model + " (" + year + "), color: " + color;
    }
}

// Строитель
public class CarBuilder {
    private Car car;

    public CarBuilder() {
        this.car = new Car();
    }

    public CarBuilder setBrand(String brand) {
        car.setBrand(brand);
        return this;
    }

    public CarBuilder setModel(String model) {
        car.setModel(model);
        return this;
    }

    public CarBuilder setYear(int year) {
        car.setYear(year);
        return this;
    }

    public CarBuilder setColor(String color) {
        car.setColor(color);
        return this;
    }

    public Car build() {
        return car;
    }

}
