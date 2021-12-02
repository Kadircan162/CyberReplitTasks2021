package ReplitAssignments2021;

import java.util.Locale;
import java.util.Scanner;

public class RemoveDublicatesWithUniqueChars {
    public static void main(String[] args) {
        String word = "sSpPoOon";
        System.out.println(uniqueChars(word));
    }
    public static String uniqueChars(String str) {
        //TODO: write your code
        String result = str.toLowerCase();
        for(int i=0; i<result.length(); i++){
            result = result.substring(0,i+1).concat(result.substring(i+1).
                    replace(result.substring(i,i+1),""));
        }
        return result;
    }
}
