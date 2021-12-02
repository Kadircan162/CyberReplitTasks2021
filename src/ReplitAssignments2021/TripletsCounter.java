package ReplitAssignments2021;

import java.util.Scanner;

public class TripletsCounter {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String str = scan.next();
        String str = "222abyyycdXXX";
        int count = 0 ;
        //WRITE YOUR CODE HERE
        for(int i=0; i<str.length()-2; i++){
            if(str.charAt(i) == str.charAt(i+1) && str.charAt(i) == str.charAt(i+2)){
                count++;
            }
        }
        System.out.println(count);
    }
}
