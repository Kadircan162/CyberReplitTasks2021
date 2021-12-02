package ReplitAssignments2021;

import java.util.Arrays;
import java.util.Scanner;

public class AddTwoArrayElementsValues {
    public static int[] addElements(int[] ints1, int[] ints2) {
        int size= ints1.length >= ints2.length ? ints1.length : ints2.length;
        int[] sum = new int[size];
        int index = Math.abs(ints1.length - ints2.length);

       if(ints1.length >= ints2.length){
           for (int i=0; i<ints2.length; i++){
               sum[i] = ints1[i] + ints2[i];
           }
           for (int i=ints1.length-index; i<ints1.length; i++){
               sum[i] = ints1[i];
           }
       }else{
           for (int i=0; i<ints1.length; i++){
               sum[i] = ints1[i] + ints2[i];
           }
           for (int i=ints2.length-index; i<ints2.length; i++){
               sum[i] = ints2[i];
           }
       }

        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] nums = new int[5];
        int [] nums2 = new int[5];
        for(int i=0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for(int i=0; i < nums.length; i++) {
            nums2[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(addElements(nums, nums2)));
    }
}
