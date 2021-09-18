package Konular;

public class K12PalindromSayi {
    //isPalindrom(4004);

    public static void isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;

        while (temp != 0) {
            //System.out.println("*****************");
            //System.out.println("Sayı : " + temp);

            lastNumber = temp % 10;
            //System.out.println("Son basamak : " + lastNumber);

            reverseNumber = (reverseNumber * 10) + lastNumber;
            //System.out.println("Yeni sayı : " + reverseNumber);

            temp /= 10;
            //System.out.println("Yeni temp : " + temp);
        }

        if (number==reverseNumber){
            System.out.println("Palindrom sayı.");
        }else {
            System.out.println("Palindrom sayı değildir.");
        }
    }
}
