package sem_3;
//Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
// что на 0й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях
// - названия книг. Напишите метод для заполнения данной структуры.
// фантастика, наименование_книги, ...
// приключения, наименование_книги, ...
// классика, наименование_книги, ...
// детектив, наименование_книги, ...

import java.util.ArrayList;
import java.util.List;

public class Ex004 {
    public static void main(String[] args) {
    task04();
    }

    public static void task04() {
        List<ArrayList<String>> catalog = new ArrayList<>();
        addBook("Фантастика", "Марсианин", catalog);
        addBook("Жанр2", "Книга21", catalog);
        addBook("Жанр2", "Книга22", catalog);
        addBook("Жанр3", "Книга31", catalog);
        addBook("Жанр4", "Книга31", catalog);
        System.out.println(catalog);
    }
    public static void addBook(String type, String name, List<ArrayList<String>> catalog){
        for (int i = 0; i < catalog.size(); i++) {
            if (catalog.get(i).get(0).equals(type)) {
                catalog.get(i).add(name);
                return;
            }
        }
        ArrayList<String> t = new ArrayList<>();
        t.add(type);
        t.add(name);
        catalog.add(t);
    }
}
