package ReplitAssignments2021;

import java.util.Scanner;

public class SplitPersonInfo {
    public static void main(String[] args) {
//        Scanner inp = new Scanner(System.in);
//        String s = inp.next();
//        person(s) ;
        person("jon,doe,30");
    }

    public static void person(String info) {
        //your code here
        System.out.println("person name: " + info.split(",")[0]);
        System.out.println("last name: " + info.split(",")[1]);
        System.out.println("age: " + info.split(",")[2]);

    }
}
