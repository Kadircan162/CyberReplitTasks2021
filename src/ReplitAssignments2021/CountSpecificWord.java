package ReplitAssignments2021;

import java.util.Scanner;

public class CountSpecificWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String word = "hi";

        int counter = 0;
        for (int i=0; i<=str.length()-word.length(); i++){
            if(str.substring(i, i+word.length()).equals(word)){
               counter++;
            }
        }
        System.out.println(counter);
    }
}
