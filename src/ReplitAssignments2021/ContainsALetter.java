package ReplitAssignments2021;

import java.util.*;

public class ContainsALetter {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String[] arr = {scan.next(),scan.next(),scan.next(),scan.next(),scan.next()};
        String[] arr = {"e", "hey", "bye", "fury", "spoon"};
        System.out.println(Arrays.toString(getWithE(arr)));

    }

    public static String[] getWithE(String[] arr) {

        //TODO : YOUR CODE GOES HERE ----------------------
        String[] dummy = new String[arr.length];

        int i = 0;
        for (String word  : arr){
            if(word.toLowerCase().contains("e")){
                dummy[i++] = word;
            }
        }
        String[] fewValues = new String[i];

        for (i=0; i<fewValues.length; i++){
                fewValues[i] = dummy[i];
        }
        //YOUR CODE ENDS HERE -----------------------
        return fewValues;
    }
}
