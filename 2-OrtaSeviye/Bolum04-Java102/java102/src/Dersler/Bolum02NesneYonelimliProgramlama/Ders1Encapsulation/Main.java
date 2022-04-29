package Dersler.Bolum02NesneYonelimliProgramlama.Ders1Encapsulation;

public class Main {
    public static void main(String[] args) {
        Book harryPotter = new Book("Harry Potter", 100);
        Book lordOfTheRings = new Book("Lord Of The Rings", -100);
//        lordOfTheRings.pageNumber = -100;
//        System.out.println(lordOfTheRings.pageNumber);
        lordOfTheRings.setPageNumber(-110000);
        System.out.println(lordOfTheRings.getPageNumber());



    }
}
