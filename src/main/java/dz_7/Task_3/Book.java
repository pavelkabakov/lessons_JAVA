package dz_7.Task_3;

public class Book implements BookInterface {

    private String title;

    private String author;

    private boolean available;

    public Book( String author, String title, boolean available) {
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
    public void displayInfo(){
        System.out.printf("title: %s, author: %s, available: %b \n", title, author, available  );
    }

    @Override
    public String getBookInfo(){
        String info = "title: " + title + ", author: " + author + ", available: " + available;
        return info;
    }
}
