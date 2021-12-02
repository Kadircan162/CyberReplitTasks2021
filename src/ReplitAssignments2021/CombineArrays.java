package ReplitAssignments2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CombineArrays {
    public static ArrayList<String> combineRs(String[] r1, String[] r2){

        // your code here

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.addAll(Arrays.asList(r1));
        arrayList.addAll(Arrays.asList(r2));
        return  arrayList;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];
        String [] strs2 = new String[in.nextInt()];
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }
        for(int i=0; i < strs2.length; i++) {
            strs2[i] = in.next();
        }

        System.out.println(combineRs(strs,strs2));

    }
}
