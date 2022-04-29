package Dersler.Bolum10DigerFaydaliKonular.Ders2LambdaExpressions;

public class Main {
    public static void main(String[] args) {
        /*Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World!");
            }
        });

        t1.start();*/

        /*Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable sınıfı!");
            }
        };

        r1.run();*/

        /*new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable sınıfı 2!");
            }
        }.run();*/

        /*Runnable r2 = () -> System.out.println("Runnable 2!");
        r2.run();*/

        /*Runnable r3 = () -> {
            System.out.println("Runnable 3!");
            System.out.println("Runnable 3.1!");
        };
        r3.run();*/

        /*Matematik toplama = new Matematik() {
            @Override
            public int transaction(int a, int b) {
                return a + b;
            }
        };

        Matematik cikarma = new Matematik() {
            @Override
            public int transaction(int a, int b) {
                return a - b;
            }
        };

        Matematik carpma = new Matematik() {
            @Override
            public int transaction(int a, int b) {
                return a * b;
            }
        };

        Matematik bolme = new Matematik() {
            @Override
            public int transaction(int a, int b) {
                if (b <= 0) {
                    b = 1;
                }
                return a / b;
            }
        };
*/

        Matematik toplama = (a, b) -> a + b;
        Matematik cikarma = (a, b) -> a - b;
        Matematik carpma = (a, b) -> a * b;
        Matematik bolme = (a, b) -> {
            if (b <= 0) {
                b = 1;
            }
            return a / b;
        };

        System.out.println(toplama.transaction(10, 2));
        System.out.println(cikarma.transaction(10, 2));
        System.out.println(carpma.transaction(10, 2));
        System.out.println(bolme.transaction(10, 0));

    }
}
