package dz_7.Task_3;

import java.util.ArrayList;
import java.util.ListIterator;

public class MyLibrary {

    ArrayList<Book> catalog = new ArrayList<Book>();

    public void addBook(Book myBook) {
        catalog.add(myBook);
    }

    public void removeBook(Book myBook) {
        catalog.remove(myBook);
    }

    public void displayAvailableBooks(boolean available) {
        for (var item : catalog) {
            if (item.isAvailable()){
                System.out.println(item.getBookInfo());
            }
        }
    }

    public void displayAllBooks() {
        for (var item : catalog) {
                System.out.println(item.getBookInfo());
        }
    }

    public void searchByAuthor(String author) {
        for (var item : catalog) {
            if (item.getAuthor().equals(author)){
                System.out.println(item.getBookInfo());
            }
        }
    }
}



