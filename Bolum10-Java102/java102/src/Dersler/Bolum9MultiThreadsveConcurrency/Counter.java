package Dersler.Bolum9MultiThreadsveConcurrency;

public class Counter extends Thread {
    @Override
    public void run() {
        System.out.println(this.getClass().getSimpleName() + " -> " + Thread.currentThread().getName());

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}
