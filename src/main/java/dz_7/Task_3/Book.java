package dz_7.Task_3;

public class Book {

    private String title;

    private String author;

    private boolean available;

    public Book( String author, String title, boolean available) {
        this.title = title;
        this.author = author;
        this.available = available;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void displayInfo(){
        System.out.printf("title: %s, author: %s, available: %b \n", title, author, available  );
    }

    public String getBookInfo(){
        String info = "title: " + title + ", author: " + author + ", available: " + available;
        return info;
    }
}
