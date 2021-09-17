package HomeWork;

public class Hw31AsalSayilar {
    public static void hesapla() {
        int sayac;

        for (int i = 2; i <= 100; i++) {
            sayac = 0;

            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    sayac += i;
                }
            }

            if (sayac == i) {
                System.out.print(i + " ");
            }
        }
    }
}
