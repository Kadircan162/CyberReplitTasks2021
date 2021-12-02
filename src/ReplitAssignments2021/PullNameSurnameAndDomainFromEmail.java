package ReplitAssignments2021;

import java.util.Locale;
import java.util.Scanner;

public class PullNameSurnameAndDomainFromEmail {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String firstName = email.substring(0, email.indexOf("_")); //.substring(0,1).toUpperCase();
        String surName = email.substring(email.indexOf("_")+1, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1,email.indexOf("."));
        String firstNameWithUpperCase = firstName.substring(0,1).toUpperCase().concat(firstName.substring(1));
        String surNameWithUppercase = surName.substring(0,1).toUpperCase().concat(surName.substring(1));
        System.out.println("First name: " + firstNameWithUpperCase);
        System.out.println("Last name: " + surNameWithUppercase);
        System.out.println("Domain: " + domain);


    }
}
