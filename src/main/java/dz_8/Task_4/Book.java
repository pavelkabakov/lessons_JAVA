package dz_8.Task_4;

public interface Book {
    String getTitle();

    void setTitle(String title);

    String getAuthor();

    void setAuthor(String author);

    boolean isAvailable();

    void setAvailable(boolean available);

    void displayInfo();

    String getBookInfo();
}
