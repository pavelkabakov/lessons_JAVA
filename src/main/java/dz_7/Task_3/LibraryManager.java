package dz_7.Task_3;

import java.util.ArrayList;

public class LibraryManager implements Library {

    private ArrayList<BookImpl> catalog = new ArrayList<BookImpl>();

    @Override
    public void addBook(BookImpl myBookImpl) {
        catalog.add(myBookImpl);
    }

    @Override
    public void removeBook(BookImpl myBookImpl) {
        catalog.remove(myBookImpl);
    }

    @Override
    public void displayAvailableBooks(boolean available) {
        for (var item : catalog) {
            if (item.isAvailable()){
                System.out.println(item.getBookInfo());
            }
        }
    }

    @Override
    public void displayAllBooks() {
        for (var item : catalog) {
                System.out.println(item.getBookInfo());
        }
    }

    @Override
    public void searchByAuthor(String author) {
        for (var item : catalog) {
            if (item.getAuthor().equals(author)){
                System.out.println(item.getBookInfo());
            }
        }
    }
}



