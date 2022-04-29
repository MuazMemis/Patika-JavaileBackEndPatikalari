package CoderByte;

public class C3AlphabetSearching {
    public static boolean AlphabetSearching(String str) {
        boolean result = true;
        String engAlp = "abcdefghijklmnopqrstuvwxyz";

        for (char a : engAlp.toCharArray()) {
            for (char abc : str.toCharArray()) {
                if (abc == a) {
                    result = true;
                    break;
                } else {
                    result = false;
                }
            }
        }

        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        AlphabetSearching("zacxyjbbkfgtbhdaielqrm45pnsowtuv");
    }
}

/*
class Main {

    public static boolean AlphabetSearching(String str) {
        boolean result = true;
        String engAlp = "abcdefghijklmnopqrstuvwxyz";

        for (char a : engAlp.toCharArray()) {
            for (char abc : str.toCharArray()) {
                if (abc == a) {
                    result = true;
                    break;
                } else {
                    result = false;
                }
            }
        }

        return result;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(AlphabetSearching(s.nextLine()));
    }

}*/
