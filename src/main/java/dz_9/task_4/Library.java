package dz_9.task_4;

public interface Library {

    void addBook(Book book);

    void removeBook(Book book);

    void displayAvailableBooks();

    void displayAllBooks();

    void searchByAuthor(String author);

}
