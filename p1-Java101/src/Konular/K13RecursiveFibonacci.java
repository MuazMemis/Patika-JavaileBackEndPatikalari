package Konular;

public class K13RecursiveFibonacci {
    static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
    //System.out.println(fib(10));
}
