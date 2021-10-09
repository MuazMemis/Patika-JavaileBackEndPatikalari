package Konular;

public class K6ContinueBreak {
    public static void continueBreak(){

        for (int i = 0; i <=10; i++) {
            if (i==2){
                continue; // Sadece 2 değeri için alt kodları çalıştırmaz. 3 ten devam eder.
            }
            if (i==5){
                System.out.println("i değeri 5");
                break; // döngüyü bitirir.
            }
            System.out.println(i);
        }
    }
}
