package sem_7.inheritance;

public class Task_ihn_2 {
    public static void main(String[] args) {
        Cat myCat = new Cat("Whiskers");
        myCat.sound(); // Вывод: Animal makes a sound
        myCat.purr(); // Вывод: Whiskers is purring

        Dog myDog = new Dog("Buddy");
        myDog.sound(); // Вывод: Animal makes a sound
        myDog.bark(); // Вывод: Buddy is barking

    }
}
class Animal {
    protected String name; // Защищенное поле name

    public Animal(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Производный класс Cat
class Cat extends Animal {
    public Cat(String name) {
        super(name); // Вызов конструктора базового класса Animal
        //
        //
        //

    }

    public void purr() {
        System.out.println(name + " is purring");
    }
}

// Производный класс Dog
class Dog extends Animal {
    public Dog(String name) {
        super(name); // Вызов конструктора базового класса Animal
    }

    public void bark() {
        System.out.println(name + " is barking");
    }
}
