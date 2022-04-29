package Odevler.Odev7KitapListesi;

public class Book {
    private String title;
    private String author;
    private int pageNumber;
    private int publish;

    public Book(String title, String author, int pageNumber, int publish) {
        this.title = title;
        this.author = author;
        this.pageNumber = pageNumber;
        this.publish = publish;
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

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPublish() {
        return publish;
    }

    public void setPublish(int publish) {
        this.publish = publish;
    }
}
