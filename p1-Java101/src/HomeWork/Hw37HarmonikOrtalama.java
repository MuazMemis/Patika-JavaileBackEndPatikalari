package HomeWork;

public class Hw37HarmonikOrtalama {
    public static void hesapla() {
        int[] list = {1, 2, 3, 4, 5};
        double sum = 0;

        for (int i = 0; i < list.length; i++) {
            sum += 1 / list[i];
        }

        double avarage = list.length / sum;
        System.out.println(avarage);
    }
}
