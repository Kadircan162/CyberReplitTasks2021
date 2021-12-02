package ReplitAssignments2021;

import java.util.Scanner;

public class SwapNameWithSurnameInEmail {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        if(email.contains("_")){
            String name = email.substring(0, email.indexOf("_"));
            String surName = email.substring(email.indexOf("_")+1, email.indexOf("@"));
            email = surName.concat("_").concat(name).concat(email.substring(email.indexOf("@")));
        }
        System.out.println(email);
    }
}
