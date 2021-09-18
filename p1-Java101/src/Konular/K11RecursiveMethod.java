package Konular;

public class K11RecursiveMethod {
    //System.out.println(f(3));

    public static int f(int n) {
        System.out.println("n=> " + n);
        if (n == 1) {
            return 1;
        }
        int result = f(n - 1) + n;
        System.out.println("result => " + result);
        return result;
    }
}
