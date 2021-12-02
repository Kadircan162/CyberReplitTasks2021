package ReplitAssignments2021;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] nums = {5,10,4,100};
        int[] dummy = new int[nums.length];
        int j=nums.length-1;
        for (int i : nums){
            dummy[j] = i;
            j--;
        }
        System.out.println(Arrays.toString(dummy));
    }

}
