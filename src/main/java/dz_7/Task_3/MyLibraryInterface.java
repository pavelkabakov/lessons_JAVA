package dz_7.Task_3;

public interface MyLibraryInterface {

    void addBook(Book myBook);

    void removeBook(Book myBook);

    void displayAvailableBooks(boolean available);

    void displayAllBooks();

    void searchByAuthor(String author);
}
