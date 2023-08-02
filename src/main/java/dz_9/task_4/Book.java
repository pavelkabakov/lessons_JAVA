package dz_9.task_4;

import java.util.Iterator;

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
