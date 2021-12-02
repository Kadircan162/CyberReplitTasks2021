package lab3StringMethodsPractice;

public class Question6ReturnStringWithoutFirstAndLastChar {
    public static void main(String[] args){
        System.out.println(ReturnStringWithoutFirstAndLastChar("Hello"));
        System.out.println(ReturnStringWithoutFirstAndLastChar("java"));
        System.out.println(ReturnStringWithoutFirstAndLastChar("coding"));
    }
    public static String ReturnStringWithoutFirstAndLastChar(String word){
        if(word.length()<2){
            return "Word is invalid";
        }
        return word.substring(1, word.length()-1);
    }
}
