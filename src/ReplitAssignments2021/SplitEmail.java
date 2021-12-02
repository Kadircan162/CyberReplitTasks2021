package ReplitAssignments2021;

import java.util.Arrays;

public class SplitEmail {
    public static void main(String[] args) {
        String email= "info@cybertekschool.com";
        if(isValidOrNot(email) == false){
            System.out.println("invalid email");
            return;
        }
        String[] arr = email.split("@");
        System.out.println("Email id: " + arr[0]);
        System.out.println("Email domain: " + arr[1]);

    }
    public static boolean isValidOrNot(String email){
        boolean isValid = true;
        String[] arr = email.split("@");

        if(arr.length==1 || arr.length>=3){ //if there is no "@" --> arr.length: 1, for two of them arr.length: 3 or more
            isValid=false;
        }
        return isValid;
    }
}
