package Odevler.Odev2KitapSiralayici;

public class Book implements Comparable<Book> {
    private String name;
    private String author;
    private int pageNumber;
    private int publishDate;

    public Book(String name, String author, int pageNumber, int publishDate) {
        this.name = name;
        this.author = author;
        this.pageNumber = pageNumber;
        this.publishDate = publishDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public int compareTo(Book o) {
        return this.getName().compareTo(o.getName());
    }
}
