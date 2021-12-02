package ReplitAssignments2021;

import java.util.Scanner;

public class PrefixDoesExist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();
        System.out.println(DoesExist(str, n));
    }
    public static boolean DoesExist(String word, int prefixIndex){
        boolean doesExist=false;
        String searchedChars = word.substring(0, prefixIndex);
        String restOfTheString = word.substring(prefixIndex);
        if(restOfTheString.contains(searchedChars)){
            doesExist=true;
        }
        return doesExist;
    }
}
