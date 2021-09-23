package HomeWork;

public class Hw45PalindromikKelimeler {
    public static void palindrome() {
        /*Palindromik kelimeler
        kavak
        kayak
        yapay
        sos
        radar
        niçin
        nacican*/

        System.out.println("Palindrome 1 : " + isPalindrome1("2yaray2"));
        System.out.println("Palindrome 2 : " + isPalindrome2("2yaray2"));
    }

    public static boolean isPalindrome1(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }
        return true;
    }

    public static boolean isPalindrome2(String str) {
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        return str.equals(reverse);
    }
}
