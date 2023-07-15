public class Task_1 {
    public static void main(String[] args) {
        Person person = new Person("John", 25); // Создание объекта класса Person с именем "John" и возрастом 25

        System.out.println("Name: " + person.getName()); // Получение имени с помощью публичного метода getName()

        person.haveBirthday(); // Вызов публичного метода haveBirthday(), который увеличит возраст на 1 и выведет сообщение

        System.out.println("Name: " + person.getName()); // Проверка нового возраста, получение имени с помощью публичного метода getName()
    }
}
class Person {
    private String name; // Приватное поле name
    private int age; // Приватное поле age

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { // Публичный метод getName() для доступа к приватному полю name
        return name;
    }

    private void celebrateBirthday() { // Приватный метод celebrateBirthday()
        age++; // Увеличение возраста на 1
        System.out.println("Happy birthday, " + name + "! You are now " + age + " years old.");
    }

    public void haveBirthday() { // Публичный метод haveBirthday()
        celebrateBirthday(); // Вызов приватного метода celebrateBirthday()
    }
}

