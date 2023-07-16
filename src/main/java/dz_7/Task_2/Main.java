// Задача 2:
//Реализуйте класс "Прямоугольник" (Rectangle), который имеет свойства ширина (width) и высота (height).
// Класс должен обладать следующими методами:
//
//Конструктор без параметров, который создает прямоугольник с шириной и высотой по умолчанию.
//Конструктор, который принимает значения ширины и высоты и создает прямоугольник с заданными значениями.
//Методы доступа (геттеры и сеттеры) для свойств ширины и высоты.
//Метод "вычислить площадь" (calculateArea), который возвращает площадь прямоугольника (ширина * высота).
//Метод "вычислить периметр" (calculatePerimeter), который возвращает периметр прямоугольника
// (2 * (ширина + высота)).

package dz_7.Task_2;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(20, 20);
        Rectangle rectangle2 = new Rectangle();

        System.out.println(rectangle1.getHeight());
        System.out.println(rectangle1.getWidth());
        System.out.println(rectangle1.calculateArea());
        System.out.println(rectangle1.calculatePerimeter());

        System.out.println(rectangle2.getHeight());
        System.out.println(rectangle2.getWidth());
        System.out.println(rectangle2.calculateArea());
        System.out.println(rectangle2.calculatePerimeter());
    }
}
