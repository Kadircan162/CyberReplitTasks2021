package ReplitAssignments2021;

public class LongestWord {
    public static void main(String[] args) {

        String[] words = {"aaa", "degrvrftny", "jaaaaaaaaave", "ddededwdw"};

        String longestWord = words[0];

        for(String dummy : words){
            if(dummy.length() > longestWord.length()){
                longestWord = dummy;
            }
        }
        System.out.println(longestWord);
    }
}
