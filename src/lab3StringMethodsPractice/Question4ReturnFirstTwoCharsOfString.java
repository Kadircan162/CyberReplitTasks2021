package lab3StringMethodsPractice;

public class Question4ReturnFirstTwoCharsOfString {

    public static void main(String[] args){
        System.out.println(ReturnFirstTwoChars("Hello"));
        System.out.println(ReturnFirstTwoChars("abcdefg"));
        System.out.println(ReturnFirstTwoChars("ab"));
        System.out.println(ReturnFirstTwoChars("H"));
        System.out.println(ReturnFirstTwoChars(""));
        System.out.println(ReturnFirstTwoChars("   "));
    }
    public static String ReturnFirstTwoChars(String word){
        if(word.isEmpty()){
            return word + "Your word is empty";
        }
        if(word.isBlank()){
            return "Your word is blank";
        }
        if(word.length()<2){
            return word + " is less than two characters";
        }
        return word.substring(0,2);
    }
}
