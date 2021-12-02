package ReplitAssignments2021;

import java.util.Locale;
import java.util.Scanner;

public class PrintLettersInAlphabeticOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char start = scan.nextLine().charAt(0);
        char end = scan.nextLine().charAt(0);

        String output = "";
        char dummy = ' ';
        if(start > end){
            dummy = start;
            start = end;
            end = dummy;
        }
        while(start <= end){
            output += start++;
        }
        System.out.println(output);
    }

}
