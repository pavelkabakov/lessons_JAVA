package DZ_ITOG2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Animal\n2. Show Commands\n3. Teach Command\n4. List Animals By Birth Date\n5. Total Animals\n6. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    // Добавление животного
                    System.out.print("Enter animal type (Cat/Dog/Hamster/Horse/Camel/Donkey): ");
                    String type = scanner.nextLine();
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter birth date (YYYY-MM-DD): ");
                    String birthDate = scanner.nextLine();

                    switch (type.toLowerCase()) {
                        case "cat":
                            registry.addAnimal(new Cat(name, birthDate));
                            break;
                        case "dog":
                            registry.addAnimal(new Dog(name, birthDate));
                            break;
                        case "hamster":
                            registry.addAnimal(new Hamster(name, birthDate));
                            break;
                        case "horse":
                            registry.addAnimal(new Horse(name, birthDate));
                            break;
                        case "camel":
                            registry.addAnimal(new Camel(name, birthDate));
                            break;
                        case "donkey":
                            registry.addAnimal(new Donkey(name, birthDate));
                            break;
                        default:
                            System.out.println("Invalid animal type!");
                            break;
                    }
                    break;
                case 2:
                    // Показать команды для животного
                    System.out.print("Enter animal name: ");
                    name = scanner.nextLine();
                    registry.showCommands(name);
                    break;
                case 3:
                    // Обучение животного новой команде
                    System.out.print("Enter animal name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter command to teach: ");
                    String command = scanner.nextLine();
                    registry.teachCommand(name, command);
                    break;
                case 4:
                    // Вывод списка животных по дате рождения
                    registry.listAnimalsByBirthDate();
                    break;
                case 5:
                    // Вывод общего количества животных
                    registry.printTotalAnimals();
                    break;
                case 6:
                    // Выход из программы
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
}
