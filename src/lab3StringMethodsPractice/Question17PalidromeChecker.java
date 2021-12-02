package lab3StringMethodsPractice;

public class Question17PalidromeChecker {
    public static void main(String[] args){

          System.out.println("1. " + palindrome("nurses run"));

    }

    public static boolean palindrome(String word){
        word = word.replace(" ", "").toLowerCase();

        boolean b = false;
        String reversedWord="";

        for(int i=word.length()-1; i>=0; i--){
            reversedWord = reversedWord.concat(word.substring(i, i+1));
        }

        b = word.equals(reversedWord);
        return b;
    }
}

////////////////////////////////////////////////////////////////////////
// public static boolean IsPalindrome(String word){
//    boolean b = false;
//    String firstHalf="", secondHalf="";
//    firstHalf = word.substring(0, word.length()/2);
//    StringBuffer sbuf = new StringBuffer(word.substring((word.length()/2+1)));
//        b = firstHalf.contentEquals(sbuf.reverse());
//       return b;
////    }
//}
