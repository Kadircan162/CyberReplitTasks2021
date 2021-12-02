package ReplitAssignments2021;

public class AnagramChecker {
    public static void main(String[] args) {
        System.out.println(anagram("listen", "listen"));
    }
    public static boolean anagram(String word1, String word2){
        word1 = word1.replace(" ", "").toLowerCase();
        word2 = word2.replace(" ", "").toLowerCase();

        if(word1.length() != word2.length()){
            return false;
        }
            for(int i=0; i<word1.length(); i++){
                if(!word1.contains(word2.substring(i, i+1))){
                    return false;
                }
                if(!word2.contains(word1.substring(i, i+1))){
                    return false;
                }
            }
        return true;
        }
}

