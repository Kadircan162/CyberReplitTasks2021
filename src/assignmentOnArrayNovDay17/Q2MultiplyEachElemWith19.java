package assignmentOnArrayNovDay17;

public class Q2MultiplyEachElemWith19 {
    //Question 2:
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int i=0; i< nums.length; i++){
            nums[i] *= 19;
        }
        for(int each : nums){
            System.out.println(each);
        }
    }
}
