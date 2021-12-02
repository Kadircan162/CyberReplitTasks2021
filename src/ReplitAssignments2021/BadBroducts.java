package ReplitAssignments2021;

import java.util.Scanner;

public class BadBroducts {
    public static boolean badP(int[] products,int limit){
        int totalOfBroken = 0;
        for(int each : products){
            if(each == 0){
                totalOfBroken++;
            }
        }
        return !(totalOfBroken >= limit);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] nums = new int[in.nextInt()];
        for(int i=0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        int limit = in.nextInt();

        System.out.println(badP(nums, limit));
    }
}
