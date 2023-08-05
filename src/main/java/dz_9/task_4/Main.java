package dz_9.task_4;

import dz_7.Task_3.BookImpl;
import dz_7.Task_3.LibraryManager;
import java.util.Iterator;

/**
 * Реализовать любой выбранный интерфейс из списка (Iterator<E>, Iterable<E>, Comparator<E>, Comparable<E>)
 * в предыдущем ДЗ, предоставив собственную реализацию.
 */

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

//        System.out.println("Реализация Iterator"); // Пытыюсь реализовать Iterator
//        Iterator<String> iterator = (Iterator<String>) bookImpl1;
//
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
    }

}
