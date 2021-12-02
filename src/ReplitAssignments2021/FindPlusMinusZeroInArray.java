package ReplitAssignments2021;

import java.util.Scanner;

public class FindPlusMinusZeroInArray {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++) {
            arr[i]=inp.nextInt();
        }
        plus_minus(arr);
    }

    public static void plus_minus(int[] in){
        int posCounter=0, negCounter=0, zeroCounter=0;
        for(int i : in){
            if(i > 0){
                posCounter++;
            }else if(i < 0){
                negCounter++;
            }else {
                zeroCounter++;
            }
        }
        System.out.println("positives:" + posCounter + ", negatives:" + negCounter + ", zeros:" + zeroCounter);
    }
}
