package ReplitAssignments2021;

import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println(wordCount(in.nextLine()));
        String sentence = "  ey ed i padanada pid e ye cdds dede  ";
        System.out.println(wordCount(sentence));
    }
    public static int wordCount(String words) {
        // your code
        int counter = 0;
        words = words.trim();
        for(int i=0; i<words.length(); i++){
            if(words.substring(i, i+1).equals(" ")){
                if(words.substring(i-2,i-1).equals(" ")){
                    continue;
                }
             counter++;
            }
        }
    return counter+1;
    }
}
