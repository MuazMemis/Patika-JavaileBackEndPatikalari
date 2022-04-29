package Odevler.Odev2KitapSiralayici;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter & the Philosopher's Stone", "J.K Rowling", 274, 1997);
        Book book2 = new Book("Lord of the Rings", "J.R.R. Tolkien", 1178, 1954);
        Book book3 = new Book("Nineteen Eighty-Four (1984)", "George Orwell", 328, 1949);
        Book book4 = new Book("The Call of the Wild", "Jack London", 232, 1903);
        Book book5 = new Book("Robinson Crusoe", "Daniel Defoe", 197, 1719);

        TreeSet<Book> books = new TreeSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        System.out.println("A -> Z");

        for (Book book : books) {
            System.out.println("Name : " + book.getName() + " -> " + book.getPageNumber());
        }

        TreeSet<Book> books2 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber() - o2.getPageNumber();
            }
        });

        books2.add(book1);
        books2.add(book2);
        books2.add(book3);
        books2.add(book4);
        books2.add(book5);

        System.out.println();
        System.out.println("Page Number");

        for (Book book : books) {
            System.out.println("Name : " + book.getName() + " -> " + book.getPageNumber());
        }

    }
}
