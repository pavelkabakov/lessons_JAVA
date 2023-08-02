package dz_9.task_4;

import java.util.Iterator;

public class BookImpl implements Book, Iterator<String> {

    private String title;
    private String author;
    private boolean available;

    public BookImpl(String author, String title, boolean available) {
        this.title = title;
        this.author = author;
        this.available = available;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public void displayInfo() {
        System.out.printf("Title: %s, Author: %s, Available: %b\n", title, author, available);
    }

    @Override
    public String getBookInfo() {
        return String.format("Title: %s, Author: %s, Available: %b", title, author, available);
    }

    // добавил для реализации Iterator
    int index;

    @Override
    public boolean hasNext() {
        return index++ < 3;
    }

    @Override
    public String next() {
        switch (index){
            case 1:
                return String.format("Title: %s ", title);
            case 2:
                return String.format("Author: %s ", author);
            default:
                return String.format("Available: %b ",available);
            }
    }
}
