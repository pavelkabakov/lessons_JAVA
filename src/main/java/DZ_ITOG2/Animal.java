package DZ_ITOG2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Базовый класс для всех животных
abstract class Animal {
    private static int animalCount = 0;
    protected String name;
    protected String type;
    protected LocalDate birthDate;
    protected List<String> commands;

    public Animal(String name, String type, LocalDate birthDate) {
        this.name = name;
        this.type = type;
        this.birthDate = birthDate;
        this.commands = new ArrayList<>();
        animalCount++;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public void addCommand(String command) {
        this.commands.add(command);
    }

    // Другие методы...
}

// Подклассы для домашних и вьючных животных
class Pet extends Animal {
    public Pet(String name, LocalDate birthDate) {
        super(name, "Pet", birthDate);
    }
}

class PackAnimal extends Animal {
    public PackAnimal(String name, LocalDate birthDate) {
        super(name, "PackAnimal", birthDate);
    }
}

// Конкретные классы животных
class Cat extends Pet { /*...*/ }
class Dog extends Pet { /*...*/ }
class Hamster extends Pet { /*...*/ }
class Horse extends PackAnimal { /*...*/ }
class Camel extends PackAnimal { /*...*/ }
class Donkey extends PackAnimal { /*...*/ }
