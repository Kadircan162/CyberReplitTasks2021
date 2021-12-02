package ReplitAssignments2021;

public class FiveNextToFive {
    public static void main(String[] args) {
        int[] nums = {1, 8, 6, 8, 5, 0};
        int searchedNum = 5;
        boolean successive = false;
        for (int i=0; i< nums.length-1; i++) {
            if(nums[i] == searchedNum && nums[i+1] == searchedNum){
                successive = true;
                break;
            }
        }
        System.out.println(successive);
    }
}
