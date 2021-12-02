package ReplitAssignments2021;

import java.util.Scanner;

public class HasStringInWord {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String serchedWord = "java";

        if(word.length()<serchedWord.length()){
            System.out.println(exists);
        }else{
            String dummy = word.substring(0,serchedWord.length());
            if(dummy.equalsIgnoreCase(serchedWord)){
                exists = true;
            }
            dummy = word.substring(1,serchedWord.length()+1);
            if (dummy.equalsIgnoreCase(serchedWord)){
                exists =true;
            }
            System.out.println(exists);
        }

    }
}
