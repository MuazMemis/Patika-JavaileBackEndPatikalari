package HomeWork;

public class Hw38ArraysMaxMin {
    public static void hesapla(){
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        int[] list2 = {15, 12, 788, 1, -1, -778, 2, 0};

        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        int kucukEnYakin = min;
        int buyukEnYakin = max;

        for (int i : list2) {
            if (i < 5) {
                min = i;
                if (min > kucukEnYakin) {
                    kucukEnYakin = min;
                }
            }
            if (i > 5) {
                max = i;
                if (max < buyukEnYakin) {
                    buyukEnYakin = max;
                }
            }
        }

//        System.out.println("Minimum Değer " + min);
//        System.out.println("Maximum Değer " + max);

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + kucukEnYakin);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + buyukEnYakin);
    }
}
