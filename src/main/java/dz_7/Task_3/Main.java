// Задача 3 - по желанию, для тех кто уже проходил ООП, чтобы было не скучно.:
//Реализуйте систему управления библиотекой. Создайте классы "Книга" (Book)
// и "Библиотека" (Library) со следующими свойствами и методами:
//
//Класс "Книга" (Book):
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
//Приватное поле "каталог" (catalog) типа ArrayList<Book> для хранения списка книг в библиотеке.
//Публичный метод "добавить книгу" (addBook), который принимает объект типа Book
// и добавляет его в каталог библиотеки.
//Публичный метод "удалить книгу" (removeBook), который принимает объект типа Book и удаляет его из каталога библиотеки.
//Публичный метод "показать доступные книги" (displayAvailableBooks), который выводит
// на консоль информацию о доступных книгах в библиотеке.
//Публичный метод "поиск книги по автору" (searchByAuthor), который принимает имя автора
// в качестве параметра и выводит на консоль информацию о книгах данного автора, находящихся
// в каталоге библиотеки.

package dz_7.Task_3;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("Автор 1","Книга 1", true);
        Book book2 = new Book("Автор 2","Книга 2", false);
        Book book3 = new Book("Автор 3","Книга 3", true);
        Book book4 = new Book("Автор 4","Книга 4", false);
        Book book5 = new Book("Автор 2","Книга 5", true);
        Book book6 = new Book("Автор 2","Книга 6", false);

        System.out.println("работа с myLibrary");
        MyLibrary library = new MyLibrary();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        System.out.println("---все книги---");
        library.displayAllBooks();
        System.out.println("---удалили 4,5---");
        library.removeBook(book4);
        library.removeBook(book5);
        library.displayAllBooks();
        System.out.println("---добавили 4,5---");
        library.addBook(book4);
        library.addBook(book5);
        library.displayAllBooks();
        System.out.println("---книги в наличии---");
        library.displayAvailableBooks(true);
        System.out.println("---книги Автора на выбор---");
        library.searchByAuthor("Автор 2");
    }
}
