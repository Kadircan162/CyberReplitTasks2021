package ReplitAssignments2021;

public class ReturnLongerWord {
    public static void main(String[] args) {
        String word1 = "applefeerer wswsw";
        String word2 = "oranged ccedewsw deeef";
        System.out.println(bigger(word1, word2));
    }
    public static String bigger(String a ,String b){
        String longerWord = (a.length() > b.length()) ? a : b;
        return  longerWord;
    }
}
