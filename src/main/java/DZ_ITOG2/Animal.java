package DZ_ITOG2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Базовый класс Animal
abstract class Animal {
    private static int count = 0;
    protected String name;
    protected String type;
    protected String birthDate;
    protected List<String> commands;

    public Animal(String name, String type, String birthDate) {
        this.name = name;
        this.type = type;
        this.birthDate = birthDate;
        this.commands = new ArrayList<>();
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void addCommand(String command) {
        commands.add(command);
    }

    public List<String> getCommands() {
        return commands;
    }

    public String getBirthDate() {
        return birthDate;
    }

    // Вывод информации о животном
    public void printInfo() {
        System.out.println("Name: " + name + ", Type: " + type + ", Birth Date: " + birthDate);
        System.out.println("Commands: " + String.join(", ", commands));
    }
}

// Классы для домашних животных
class Pets extends Animal {
    public Pets(String name, String type, String birthDate) {
        super(name, type, birthDate);
    }
}

class Cat extends Pets {
    public Cat(String name, String birthDate) {
        super(name, "Cat", birthDate);
    }
}

class Dog extends Pets {
    public Dog(String name, String birthDate) {
        super(name, "Dog", birthDate);
    }
}

class Hamster extends Pets {
    public Hamster(String name, String birthDate) {
        super(name, "Hamster", birthDate);
    }
}

// Классы для вьючных животных
class PackAnimals extends Animal {
    public PackAnimals(String name, String type, String birthDate) {
        super(name, type, birthDate);
    }
}

class Horse extends PackAnimals {
    public Horse(String name, String birthDate) {
        super(name, "Horse", birthDate);
    }
}

class Camel extends PackAnimals {
    public Camel(String name, String birthDate) {
        super(name, "Camel", birthDate);
    }
}

class Donkey extends PackAnimals {
    public Donkey(String name, String birthDate) {
        super(name, "Donkey", birthDate);
    }
}