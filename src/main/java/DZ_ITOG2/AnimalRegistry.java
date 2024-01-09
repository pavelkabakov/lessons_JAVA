package DZ_ITOG2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Класс для управления реестром животных
class AnimalRegistry {
    private List<Animal> animals;

    public AnimalRegistry() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void showCommands(String name) {
        for (Animal animal : animals) {
            if (animal.name.equals(name)) {
                System.out.println("Commands for " + name + ": " + String.join(", ", animal.getCommands()));
                return;
            }
        }
        System.out.println("Animal not found!");
    }

    public void teachCommand(String name, String command) {
        for (Animal animal : animals) {
            if (animal.name.equals(name)) {
                animal.addCommand(command);
                System.out.println("Command added: " + command);
                return;
            }
        }
        System.out.println("Animal not found!");
    }

    public void listAnimalsByBirthDate() {
        Collections.sort(animals, Comparator.comparing(Animal::getBirthDate));
        for (Animal animal : animals) {
            animal.printInfo();
        }
    }

    public void printTotalAnimals() {
        System.out.println("Total animals: " + Animal.getCount());
    }
}



