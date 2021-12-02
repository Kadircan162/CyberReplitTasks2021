package lab3StringMethodsPractice;

import java.util.SortedMap;

public class Question15DoesBadAppear {
    public static void main(String[] args){
        System.out.println(DoesBadAppear("xxbadxxbad"));
        System.out.println(DoesBadAppear("xbadxx"));
        System.out.println(DoesBadAppear("xxbadxx"));
    }
    public static boolean DoesBadAppear(String word){
        if(word.isBlank() || word.isEmpty()){
            return false;
        }else if(word.substring(0,3).equalsIgnoreCase("bad") ||
                word.substring(1,4).equalsIgnoreCase("bad")) {
            return true;
        }else {
            return false;
        }
    }
}
