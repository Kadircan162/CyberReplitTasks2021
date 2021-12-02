package ReplitAssignments2021;

import java.util.Scanner;

public class WithoutXOrx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        if(word.charAt(0) == 'X' || word.charAt(0) == 'x'){
            word = word.substring(1);
        }
        if(word.charAt(word.length()-1) == 'X' || word.charAt(word.length()-1) == 'x'){
            word = word.substring(0,word.length()-1);
        }
        System.out.println(word);
    }
}
