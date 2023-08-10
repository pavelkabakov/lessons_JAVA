package sem_7.polymorphism;

public class Ex001 {
    public static void main(String[] args) {
        Circle shape1 = new Circle(); // Создание объекта ICircle и присвоение его переменной shape1
        Rectangle shape2 = new Rectangle(); // Создание объекта IRectangle и присвоение его переменной shape2

        shape1.draw(); // Вызов метода draw() объекта shape1 (типа ICircle), будет выведено "Drawing a circle."
        shape2.draw(); // Вызов метода draw() объекта shape2 (типа IRectangle), будет выведено "Drawing a rectangle."

    }
}
class Shape {
    public void draw() {
        System.out.println("Drawing a shape.");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}
