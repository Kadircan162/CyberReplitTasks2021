package ReplitAssignments2021;

import java.util.*;

public class SwitchElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = {in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt()};
        arr = do_switch(arr);
        String numbers = "[";
        int k=0;
        while (k<arr.length-1){
            numbers += ""+arr[k]+",";
            k++;
        }
        numbers += arr[arr.length-1] + "]";
        System.out.println(numbers);

    }
    public static int[] do_switch(int[] i) {
        int dummy = i[0];
        i[0] = i[i.length-1];
        i[i.length-1] = dummy;

        return i;
    }
}
