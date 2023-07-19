package dz_7.Task_4;

public class BookImpl implements Book{

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
}
