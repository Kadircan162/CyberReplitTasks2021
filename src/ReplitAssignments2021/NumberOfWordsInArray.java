package ReplitAssignments2021;

import java.util.Arrays;
import java.util.Scanner;

public class NumberOfWordsInArray {
    public static int countAppearance(String[] arr,String t){
        int count = 0;
        int i=0;
        while (i<arr.length) {
            if(t.equalsIgnoreCase(arr[i])){
                count++;
            }
            i++;
        }
        return count;
    } //end  count_appearance

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];
        String word = in.next();
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }

        System.out.println(countAppearance(strs,word));

    }
}
