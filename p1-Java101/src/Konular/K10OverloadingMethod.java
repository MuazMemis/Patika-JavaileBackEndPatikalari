package Konular;

public class K10OverloadingMethod {
    /*
        print();
        print(12);
        print(12.54);
        System.out.println(print(2,3));
        System.out.println(print(2,3,5));

    */

    static void print() {
        System.out.println("Parametresiz metot.");
    }

    static void print(int a) {
        System.out.println("Parametreler: " + a);
    }

    static void print(double a) {
        System.out.println("Parametreler double: " + a);
    }

    static int print(int a, int b) {
        return a + b;
    }

    static int print(int a, int b, int c) {
        return a + b + c;
    }
}
