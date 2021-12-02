package Day27Lab4;

public class Q16CountAndPrintEvenNums {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9, 8};
        System.out.println(EvenNumbers(nums));
    }
    public static int EvenNumbers(int[] arr) {
        int count=0;
        for(int isEven : arr){
            if(isEven % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
