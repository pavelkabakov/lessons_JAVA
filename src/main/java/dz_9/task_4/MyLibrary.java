package dz_9.task_4;

import java.util.ArrayList;
import java.util.List;

public class MyLibrary implements Library {

    private List<Book> catalog = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        catalog.add(book);
    }

    @Override
    public void removeBook(Book book) {
        if (catalog.contains(book)) {
            catalog.remove(book);
        } else {
            System.out.println("Book not found in the library catalog.");
        }
    }

    @Override
    public void displayAvailableBooks() {
        for (Book book : catalog) {
            if (book.isAvailable()) {
                System.out.println(book.getBookInfo());
            }
        }
    }

    @Override
    public void displayAllBooks() {
        for (Book book : catalog) {
            System.out.println(book.getBookInfo());
        }
    }

    @Override
    public void searchByAuthor(String author) {
        for (Book book : catalog) {
            if (book.getAuthor().equals(author)) {
                System.out.println(book.getBookInfo());
            }
        }
    }
}
