package sem_13.prototype;

public class Main {
    public static void main(String[] args) {
        // Создаем оригинальные объекты
        Circle originalCircle = new Circle();
        Square originalSquare = new Square();

        try {
            // Клонируем оригинальные объекты
            Circle clonedCircle = (Circle) originalCircle.clone();
            Square clonedSquare = (Square) originalSquare.clone();

            // Проверим, что объекты скопировались правильно
            System.out.println("Original ICircle Type: " + originalCircle.getType()); // Output: Original ICircle Type: ICircle
            System.out.println("Cloned ICircle Type: " + clonedCircle.getType()); // Output: Cloned ICircle Type: ICircle

            System.out.println("Original Square Type: " + originalSquare.getType()); // Output: Original Square Type: Square
            System.out.println("Cloned Square Type: " + clonedSquare.getType()); // Output: Cloned Square Type: Square
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
