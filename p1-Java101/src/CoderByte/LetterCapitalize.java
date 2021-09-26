package CoderByte;

public class LetterCapitalize {
    public static String LetterCapitalize(String str) {
        String words[]=str.split("\\s");
        String capitalizeStr="";

        for(String word:words){
            String firstLetter=word.substring(0,1);
            String remainingLetters=word.substring(1);
            capitalizeStr+=firstLetter.toUpperCase()+remainingLetters+" ";
        }

        return capitalizeStr;
    }
}
