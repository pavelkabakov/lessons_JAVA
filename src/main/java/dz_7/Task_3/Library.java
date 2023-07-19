package dz_7.Task_3;

public interface Library {

    void addBook(BookImpl myBookImpl);

    void removeBook(BookImpl myBookImpl);

    void displayAvailableBooks(boolean available);

    void displayAllBooks();

    void searchByAuthor(String author);
}
