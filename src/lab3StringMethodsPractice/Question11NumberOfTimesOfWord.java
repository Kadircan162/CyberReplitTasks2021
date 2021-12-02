package lab3StringMethodsPractice;

public class Question11NumberOfTimesOfWord {
    public static void main(String[] args){
        System.out.println(NumberOfTimesContain2("abc hi ho", "hi"));
        System.out.println(NumberOfTimesContain2("abc hi ho", "hi"));
        System.out.println(NumberOfTimesContain2("hihi hitherehi", "hi"));
    }
    public static int NumberOfTimesContain2(String word1, String word2){
        int count=0;
        for (int i=0; i<word1.length()-1; i++){
            if(word1.substring(i, i+2).equals(word2)){
                count++;
            }
        }
        return count;
    }
}
