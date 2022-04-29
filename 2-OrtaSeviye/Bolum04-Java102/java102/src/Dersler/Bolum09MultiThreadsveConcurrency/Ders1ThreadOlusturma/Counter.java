package Dersler.Bolum09MultiThreadsveConcurrency.Ders1ThreadOlusturma;

public class Counter extends Thread {
    @Override
    public void run() {
        System.out.println(this.getClass().getSimpleName() + " -> " + Thread.currentThread().getName());

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}
