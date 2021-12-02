package ReplitAssignments2021;

import java.util.Scanner;

public class UniqueNums {
    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//        int size = scan.nextInt();
//        int[] nums = new int[size];
//        for(int i=0; i < size; i++){
//            nums[i] = scan.nextInt();
//        }
        int[] nums = {2, 5, 5, 6, 3, 6, 9, 34, 3};
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums) { //4, 43, 5, 5, 6, 3, 6, 9, 34, 3
        //WRITE YOUR CODE HERE
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j<nums.length; j++) {
                if (nums[i] == nums[j]) {
                    counter++;
                }

            }
            if(counter==1){
                System.out.println(nums[i]);
            }
            counter=0;

        }
    }
}

