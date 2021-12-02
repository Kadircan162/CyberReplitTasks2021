package ReplitAssignments2021;

public class FindMaxNum {
    public static void main(String[] args) {
        int[] nums = {2, 4, 2, 9, -2};
        int index= 0, maxNum = 0;
        for (int maxFlag : nums){
            if(maxFlag > maxNum){
                maxNum = maxFlag;
            }
        }
        System.out.println(maxNum);
    }
}
