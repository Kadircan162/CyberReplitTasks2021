package Day27Lab4;

import java.util.Arrays;

public class Q5RotateLeft {
    public static void main(String[] args) {
        int[] numsArr = {17,12,10,8};
        System.out.println(Arrays.toString(RotateLeft(numsArr)));
    }
    public static int[] RotateLeft(int[] nums){
        int dummy = nums[0];
        for(int i=0; i<nums.length-1; i++){
            nums[i] = nums[i+1];
        }
        nums[nums.length-1] = dummy;
        return nums;
    }
}
