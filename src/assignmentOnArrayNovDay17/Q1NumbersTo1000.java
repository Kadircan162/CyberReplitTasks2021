package assignmentOnArrayNovDay17;

public class Q1NumbersTo1000 {
    //Question 1:
    public static void main(String[] args) {
        int[] nums = new int[1000];
        int j=0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
            System.out.print(nums[i] + " ");
            if (i == (j+9)) {
                System.out.println();
                j+=10;
            }
        }
    }
}
