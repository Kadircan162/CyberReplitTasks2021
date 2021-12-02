package ReplitAssignments2021;

import java.util.Scanner;

public class MethodOverload {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean runInt = in.nextBoolean();
        int size = in.nextInt();

        if(runInt) {
            int [] arr = new int[size];
            for(int i=0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
            System.out.println(findMax(arr));
        } else {
            double [] arr = new double[size];
            for(int i=0; i < arr.length; i++) {
                arr[i] = in.nextDouble();
            }
            System.out.println(findMax(arr));
        }
    }
    public static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int each : arr){
            if(each > max){
                max = each;
            }
        }
        return max;
    }

    public static double findMax(double[] arr){
        double max = Double.MIN_VALUE;

        for (double each : arr){
            if(each > max){
                max = each;
            }
        }
        return max;
    }
}
