package ReplitAssignments2021;

import java.util.Scanner;

public class ReadOrNotReadEmails {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();

        //your code here
        a = a.toLowerCase();
        if(a.contains("alejandro")){
            System.out.println("read");
        }else{
            System.out.println("don't read");
        }
    }
}
