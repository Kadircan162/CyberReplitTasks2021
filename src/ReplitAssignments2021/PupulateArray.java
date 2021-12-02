package ReplitAssignments2021;

import java.util.*;

public class PupulateArray {
    public static int[] populate(int[] r) {
        int k=0;
        for(int j=1; j<=r.length; j++){
            r[k] = j;
            k++;
        }
      return r;
    }

    public static void main(String[] args) 	{
        int [] i= new int[new Scanner(System.in).nextInt()];
        i = populate(i) ;
        String n = "[";
        int k=0;
        while (k < i.length-1){
            n += "" + i[k] + ",";
            k++;
        }
        n += i[i.length-1] + "]";
        System.out.println(n);

    }
}
