package DZ_ITOG2;

import java.util.ArrayList;
import java.util.List;

public class AnimalRegistry {
    private List<Animal> animals;

    public AnimalRegistry() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void listAnimalsByBirthDate() {
        // Сортировка и вывод животных по дате рождения
    }

    public void listAnimalCommands(String animalName) {
        // Вывод команд для конкретного животного
    }

    // Другие методы...
}



