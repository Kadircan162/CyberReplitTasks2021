package lab3StringMethodsPractice;

public class Question2ReverseString {

    public static void main(String[] args){
        reverseWord("Hi", "Bye");
        reverseWord("Yo", "Alice");
        reverseWord("What", "Up");
    }
    public static void reverseWord(String word, String word2){
        String reversedWord = word.concat(word2) + word2.concat(word);
        System.out.println(reversedWord);
    }
}
