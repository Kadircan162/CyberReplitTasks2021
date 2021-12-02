package assignmentOnStringAndMethodsDay29;

public class Q5MergeTwoWords {
    public static void main(String[] args) {
        String word1 = "jav";
        String word2 = "wow";
        if(word1.length() != 3 || word2.length() != 3){
            System.out.println("cannot merge");
        return;
        }
        for(int i=0; i<word1.length(); i++){
            System.out.print(word1.charAt(i) + "" + (word2.charAt(i)));
        }
    }
}
