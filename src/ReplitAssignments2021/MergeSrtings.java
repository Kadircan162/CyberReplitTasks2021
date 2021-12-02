package ReplitAssignments2021;

import java.util.Scanner;

public class MergeSrtings {
    public static String mergeStrings(String one, String two) {
        String resultString = "";
            for(int i=0; i < one.length() || i < two.length(); i++){
                if(i==one.length()) {
                    resultString += two.substring(i);
                    break;
                }else if(i==two.length()){
                    resultString += one.substring(i);
                    break;
                }
                resultString += one.substring(i,i+1).concat(two.substring(i,i+1));
                //resultString += two.substring(i,i+1);
            }
        return resultString;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(mergeStrings(in.nextLine(), in.nextLine()));
    }
}
