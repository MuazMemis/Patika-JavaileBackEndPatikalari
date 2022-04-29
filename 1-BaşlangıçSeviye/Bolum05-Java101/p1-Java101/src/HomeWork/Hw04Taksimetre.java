package HomeWork;

import java.util.Scanner;

public class Hw04Taksimetre {
    public void taksimetre(){
        int km = 0;
        double perKm = 2.2, startPrice = 10, total;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi KM cinsinden giriniz : ");
        km = input.nextInt();

        total = startPrice;
        total += (km * perKm);

        total = (total < 20) ? 20 : total;
        System.out.println(total);
    }
}
