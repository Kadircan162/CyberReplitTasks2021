package assignmentOnStringAndMethodsDay29;

public class Q15SameNumberOfWords {
    public static void main(String[] args) {
        String word = "cat-cheetah-dog-catdog";

        if(howManyTimes(word, "cat") == howManyTimes(word, "dog")) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

    }
    private static int howManyTimes(String word, String search){
        int count=0;
        for(int i=0; i<=word.length()-search.length(); i++){
            if(word.substring(i, i+search.length()).equals(search)){
                count++;
            }
        }
        return count;
    }

}
