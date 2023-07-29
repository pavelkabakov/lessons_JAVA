// Задача 3 - по желанию, для тех кто уже проходил ООП, чтобы было не скучно.:
//Реализуйте систему управления библиотекой. Создайте классы "Книга" (BookImpl)
// и "Библиотека" (Library) со следующими свойствами и методами:
//
//Класс "Книга" (BookImpl):
//
//Приватные поля "название" (title) и "автор" (author) типа String для хранения названия
// и автора книги соответственно.
//Приватное поле "доступность" (available) типа boolean для указания доступности книги.
//Публичные методы доступа (геттеры и сеттеры) для полей "название" и "автор".
//Публичные методы доступа (геттеры и сеттеры) для поля "доступность".
//Публичный метод "показать информацию" (displayInfo), который выводит на консоль информацию
// о книге (название, автор, доступность).
//Класс "Библиотека" (Library):
//
//Приватное поле "каталог" (catalog) типа ArrayList<BookImpl> для хранения списка книг в библиотеке.
//Публичный метод "добавить книгу" (addBook), который принимает объект типа BookImpl
// и добавляет его в каталог библиотеки.
//Публичный метод "удалить книгу" (removeBook), который принимает объект типа BookImpl и удаляет его из каталога библиотеки.
//Публичный метод "показать доступные книги" (displayAvailableBooks), который выводит
// на консоль информацию о доступных книгах в библиотеке.
//Публичный метод "поиск книги по автору" (searchByAuthor), который принимает имя автора
// в качестве параметра и выводит на консоль информацию о книгах данного автора, находящихся
// в каталоге библиотеки.

package dz_8.Task_3;

public class Main {

    public static void main(String[] args) {
        BookImpl bookImpl1 = new BookImpl("Автор 1","Книга 1", true);
        BookImpl bookImpl2 = new BookImpl("Автор 2","Книга 2", false);
        BookImpl bookImpl3 = new BookImpl("Автор 3","Книга 3", true);
        BookImpl bookImpl4 = new BookImpl("Автор 4","Книга 4", false);
        BookImpl bookImpl5 = new BookImpl("Автор 2","Книга 5", true);
        BookImpl bookImpl6 = new BookImpl("Автор 2","Книга 6", false);

        System.out.println("работа с myLibrary");
        LibraryManager library = new LibraryManager();
        library.addBook(bookImpl1);
        library.addBook(bookImpl2);
        library.addBook(bookImpl3);
        library.addBook(bookImpl4);
        library.addBook(bookImpl5);
        library.addBook(bookImpl6);
        System.out.println("---все книги---");
        library.displayAllBooks();
        System.out.println("---удалили 4,5---");
        library.removeBook(bookImpl4);
        library.removeBook(bookImpl5);
        library.displayAllBooks();
        System.out.println("---добавили 4,5---");
        library.addBook(bookImpl4);
        library.addBook(bookImpl5);
        library.displayAllBooks();
        System.out.println("---книги в наличии---");
        library.displayAvailableBooks(true);
        System.out.println("---книги Автора на выбор---");
        library.searchByAuthor("Автор 2");
    }
}
