package Odevler.Odev7KitapListesi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("İki Şehrin Hikayesi", "Charles Dickens", 311, 1859);
        Book book2 = new Book("Yüzüklerin Efendisi", "J. R. R. Tolkien", 1026, 1954);
        Book book3 = new Book("Hobbit", "J. R. R. Tolkien", 426, 1937);
        Book book4 = new Book("Küçük Prens", "Antoine de Saint-Exupéry ", 112, 1943);
        Book book5 = new Book("Harry Potter", "J. K. Rowling", 223, 1997);
        Book book6 = new Book("On Küçük Zenci", "Agatha Christie", 191, 1939);
        Book book7 = new Book("Kızıl Köşkün Rüyası", "Cao Xueqin", 902, 1791);
        Book book8 = new Book("Da Vinci Şifresi", "Dan Brown", 528, 2003);
        Book book9 = new Book("Düşün ve Zengin Ol", "Napoleon Hill", 381, 1937);
        Book book10 = new Book("Simyacı", "Paulo Coelho", 188, 1988);

        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);
        books.add(book8);
        books.add(book9);
        books.add(book10);

        Map<String, String> titleAndAuthor = new HashMap<>();

        for (Book book : books) {
            titleAndAuthor.put(book.getTitle(), book.getAuthor());
        }

        printTitleAndAuthor(titleAndAuthor);
        printNewList(books);
    }

    private static void printTitleAndAuthor(Map<String, String> titleAndAuthor) {
        System.out.println("-------------------- | --------------------");
        System.out.printf("%-14s | %14s", "\t\tBOOK", "AUTHOR");
        System.out.printf("\n%-20s | %-20s", "--------------------", "--------------------");

        for (String key : titleAndAuthor.keySet()) {
            System.out.printf("\n%-20s | %10s", key, titleAndAuthor.get(key));
        }
    }

    private static void printNewList(ArrayList<Book> books) {
        List<Book> newList = books.stream().filter(book -> book.getPageNumber() > 200).toList();

        System.out.println("\n\n*-*-*-* THE BOOKS WHICH HAS PAGES MORE THAN 100 *-*-*-*");

        for (Book book : newList) {
            System.out.printf("\n-> Book Name: %-20s Pages: %-20s", book.getTitle(), book.getPageNumber());
        }
    }
}
