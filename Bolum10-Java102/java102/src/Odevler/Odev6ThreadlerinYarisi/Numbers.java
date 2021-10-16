package Odevler.Odev6ThreadlerinYarisi;

import java.util.ArrayList;

public class Numbers implements Runnable {
    private ArrayList<Integer> numbers;
    public ArrayList<Integer> ciftSayilar = new ArrayList<>();
    public ArrayList<Integer> tekSayilar = new ArrayList<>();

    public Numbers(ArrayList<Integer> list) {
        this.numbers = list;
    }

    @Override
    public void run() {
        evenAndOdd();
    }

    public synchronized void evenAndOdd() {

        for (int number : this.numbers) {

            switch (number % 2) {

                case 0:
                    synchronized (Main.even) {
                        Main.even.add(number);
                        System.out.println(Thread.currentThread().getName() + " even numbers : " + number);
                    }
                    break;
                case 1:
                    synchronized (Main.odd) {
                        Main.odd.add(number);
                        System.out.println(Thread.currentThread().getName() + " odd numbers : " + number);
                    }
                    break;

            }

        }
    }
}
