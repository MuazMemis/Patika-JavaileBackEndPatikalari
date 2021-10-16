package Dersler.Bolum9MultiThreadsveConcurrency.Ders6ThreadPooling;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        OrderMatic orderMatic = new OrderMatic();
        ExecutorService pool = Executors.newFixedThreadPool(4); // 10 tane thread oluşturur.

        for (int i = 0; i < 100; i++) {
            pool.execute(orderMatic);
        }

        pool.shutdown();
    }
}
