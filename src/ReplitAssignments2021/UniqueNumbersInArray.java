package ReplitAssignments2021;

import java.util.Random;
import java.util.Scanner;

public class UniqueNumbersInArray {
    public static void main(String[] args) {
       // Scanner scan = new Scanner(System.in);
        //int size = scan.nextInt();
        //int[] nums = new int[size];
        int[] nums = {2, 5, 5, 6, 3, 6, 9, 34, 3};
       /* for(int i=0; i < nums.length; i++){
            nums[i] = new Random().nextInt(30);//scan.nextInt();
        }
        */
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE
        int count=0;
        for(int i=0; i<nums.length; i++){
            boolean isUnique = true;
            for (int j : nums) {
                if (nums[i] == j) {
                    count++;
                    if(count>1){ //found more times than itself
                        isUnique = false;
                        count = 0;
                        break;
                    }
                }

            }
            if(isUnique){
                System.out.println(nums[i]);
                count = 0;
            }

        }
    }
}
