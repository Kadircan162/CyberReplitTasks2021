package ReplitAssignments2021;

import java.util.Scanner;

public class RepeatSeparerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String separator = scan.nextLine();
        int count = scan.nextInt();

        String newStr = "";
        for(int i=0; i<count; i++){
            newStr += word;
            if(i != count-1){ //to exclude last seperator
                newStr += separator;
            }
        }
        System.out.println(newStr);
    }

}
