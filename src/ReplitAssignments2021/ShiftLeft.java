package ReplitAssignments2021;

import java.util.Arrays;

public class ShiftLeft {
    public static void main(String[] args) {
        int[] nums = {6, 2, 5, 3};
        int flag=nums[0];

        for(int i=0; i<nums.length-1; i++){
            nums[i] = nums[i+1];
        }
        nums[nums.length-1] = flag;
        System.out.println(Arrays.toString(nums));
    }
}
