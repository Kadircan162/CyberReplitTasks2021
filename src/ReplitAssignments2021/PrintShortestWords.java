package ReplitAssignments2021;

import java.util.Arrays;

public class PrintShortestWords {
    public static void main(String[] args) {
        String str = "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";
        printSmallestWords(str);
    }

    public static void printSmallestWords(String str){
        String[] words = str.replace(" ", "").split(",");
        Arrays.sort(words);
        String[] newWords = null;
        String[] dummy = new String[words.length];

        int countSize=0;
        int smallestSize = bringSmallestSize(words);
        for(String check : words){ //here to count words with smallest size
            if(check.length() == smallestSize){
                dummy[countSize] = check;
                countSize++;
                newWords = new String[countSize];
                for (int i=0; i<newWords.length; i++){
                    newWords[i] = dummy[i];
                }
            }
        }
        System.out.println(Arrays.toString(newWords));

    }

    public static int bringSmallestSize(String[] words){
        int smallestLength = words[0].length();
        for(int i=0; i<words.length; i++){
            if(words[i].length() < smallestLength){
                smallestLength = words[i].length();
            }
        }
        return smallestLength;
    }
}
