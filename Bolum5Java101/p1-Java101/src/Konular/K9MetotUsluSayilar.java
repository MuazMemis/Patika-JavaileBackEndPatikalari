package Konular;

public class K9MetotUsluSayilar {
    public static void power(int base, int exp) {
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        System.out.println(result);
    }
}
