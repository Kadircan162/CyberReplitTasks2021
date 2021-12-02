package ReplitAssignments2021;

public class TotalOfElementsInArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 5, 7};
        int i=0 , sum=0;
        while (i<nums.length){
            sum += nums[i];
            i++;
        }
        System.out.println(sum);
    }
}
