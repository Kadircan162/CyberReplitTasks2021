package lab3StringMethodsPractice;

public class Question5FirstHalfOfString {

    public static void main(String[] args){
        System.out.println(ReturnFirstHalf("WooHoo"));
        System.out.println(ReturnFirstHalf("HelloThere"));
        System.out.println(ReturnFirstHalf("abcdef"));
    }
    public static String ReturnFirstHalf(String word){
        if(word.length()%2!=0){
            return "Your word is invalid as having odd number of characters";
        }
        return word.substring(0, word.length()/2);
    }
}
