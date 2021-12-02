package ReplitAssignments2021;

public class FindNonDublicate {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 7, 3, 4, 3, 4};

        for (int nonDup : nums){
          int count = 0;
            for (int i=0; i<nums.length; i++){
                if(nonDup == nums[i]){
                    count++;
                }
            }
            if(count == 1){
                System.out.println(nonDup);
                break;
            }
        }
    }




}
