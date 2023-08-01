package sem_12.L_2;

abstract class Animal {
    public abstract void makeSound();
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }

    public void fetch() {
        System.out.println("Dog fetches.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows.");
    }

    public void scratch() {
        System.out.println("Cat scratches.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.makeSound(); // Вывод: Dog barks.
        animal2.makeSound(); // Вывод: Cat meows.


        // Теперь нет нарушения принципа LSP
        if (animal1 instanceof Dog) {
            Dog dog = (Dog) animal1; // Преобразование типа
            dog.fetch(); // Вывод: Dog fetches.
        }

        if (animal2 instanceof Cat) {
            Cat cat = (Cat) animal2; // Преобразование типа
            cat.scratch(); // Вывод: Dog fetches.
        }
    }
}
