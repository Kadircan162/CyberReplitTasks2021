package ReplitAssignments2021;

public class LeftRightEqualToCenter {
    public static void main(String[] args) {
        int[] nums = {4, 5, 4, 7, 2};
        System.out.println(center(nums));
    }
    public static int center(int[] nums){

        int totalLeft=0, totalRight=0;

        for(int i=0; i<nums.length; i++){
            for(int j=0; j<i; j++){
                totalLeft += nums[j];
            }
            for(int m=nums.length-1; m>i; m--){
                totalRight += nums[m];
            }
            if(totalLeft == totalRight){
                return i;
            }
            totalLeft=0;
            totalRight=0;
        }
        return -1;
    }
}
