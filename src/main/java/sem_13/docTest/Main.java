package sem_13.docTest;

// Пример документирования кода

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        Circle circle = new Circle(7);

        double sumAreas = GeometryUtils.sumAreas((Shape) rectangle, (Shape) circle);

        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println("Сумма площадей: " + sumAreas);
    }
}
