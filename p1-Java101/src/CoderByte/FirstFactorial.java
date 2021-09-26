package CoderByte;

public class FirstFactorial {
    public static int FirstFactorial(int num) {
        // code goes here
        int totalN=1;
        for (int i = 1; i <= num; i++) {
            totalN *= i;
        }

        return totalN;
    }
}
