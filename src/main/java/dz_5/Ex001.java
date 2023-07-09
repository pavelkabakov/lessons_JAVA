package dz_5;
//Задание
//
//Реализуйте структуру телефонной книги с помощью HashMap.
//Программа также должна учитывать, что во входной структуре
// будут повторяющиеся имена с разными телефонами, их необходимо считать,
// как одного человека с разными телефонами.
// Вывод должен быть отсортирован по убыванию числа телефонов.
public class Ex001 {
    public static void main(String[] args) {
        task();
    }

    static void task(){
        myPhoneBook phonebook = new myPhoneBook();
        phonebook.add("9102358848", "Петров Петр");
        phonebook.add("9102358849", "Петров Петр");
        phonebook.add("9102358850", "Васильев Василий");
        phonebook.add("9102356645", "Иванов Иван");
        phonebook.add("9102358746", "Иванов Иван");
        phonebook.add("9102358847", "Иванов Иван");
        phonebook.add("7772358881", "Алексеев Вася");
        phonebook.add("7772358111", "Алексеев Вася");
        phonebook.add("8002358881", "Толстой Алексей");
        phonebook.add("8012358111", "Толстой Алексей");

        System.out.println("--- Поиск по фамилии ---");
        System.out.println(phonebook.getByName("Иванов Иван"));
        System.out.println("--- Поиск по номеру ---");
        System.out.println(phonebook.getByPhoneNum("9102356645"));
        System.out.println("--- Вся книга без сортировки ---");
        System.out.println(phonebook.getAll());
        System.out.println("--- Вывод полной книги с сортировкой по убыванию числа телефонов ---");
        System.out.println(phonebook.getAll_sorted());
    }
}
