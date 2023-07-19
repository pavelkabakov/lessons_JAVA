package dz_7.Task_3;

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
