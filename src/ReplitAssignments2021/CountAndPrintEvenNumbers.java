package ReplitAssignments2021;

public class CountAndPrintEvenNumbers {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9};
        int count=0;
        for(int isEven : nums){
            if(isEven % 2 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
