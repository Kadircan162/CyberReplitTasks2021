package ReplitAssignments2021;

import java.util.Arrays;

public class PrintFirstAndLastChar {
    public static void main(String[] args) {
        String[] words = {"hello", "why", "by", "apple" , "note"};
        String[] newWords = new String[words.length];
        int i=0;
        for(String firstLast : words){
            newWords[i]=firstLast.substring(0,1).concat(firstLast.substring(firstLast.length()-1));
            i++;
        }

        System.out.println(Arrays.toString(newWords));

    }
}
