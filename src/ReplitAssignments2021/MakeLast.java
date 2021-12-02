package ReplitAssignments2021;

import java.util.Arrays;

public class MakeLast {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 7};
        int[] newNums = new int[nums.length*2];
        newNums[newNums.length-1] = nums[nums.length-1];
        System.out.println(Arrays.toString(newNums));
    }
}
