package lab3StringMethodsPractice;

public class Question3NewStringWithCopiesOfLast2Chars {

    public static void main(String[] args){
        System.out.println(NewStringWithCopiesOfLast2Chars("Hello", 3));
        System.out.println(NewStringWithCopiesOfLast2Chars("ab", 5));
        System.out.println(NewStringWithCopiesOfLast2Chars("Hi", 8));
        System.out.println(NewStringWithCopiesOfLast2Chars("Hey I'm learning Java here", 10));
        System.out.println(NewStringWithCopiesOfLast2Chars("a", 10));
    }
    public static String NewStringWithCopiesOfLast2Chars(String word, int copyNumber){
        String newWord="";
        if(word.length()<2){
            return "Input is invalid as having less than two characters";
        }
        for (int i=1; i<=copyNumber; i++){
                newWord += word.substring(word.length()-2);
            }
       return newWord;
    }
}
