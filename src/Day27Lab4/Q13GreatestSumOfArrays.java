package Day27Lab4;

import java.util.Arrays;

public class Q13GreatestSumOfArrays {
    public static void main(String[] args) {
        int[] intArr1 = {5,6,2};
        int[] intArr2 = {3,4,6};

        PrintGreatestSumOfArray(intArr1, intArr2);
    }
    public static void PrintGreatestSumOfArray(int[] arr1, int[] arr2){
        int total1 = 0, total2 = 0;
        for(int each : arr1){
            total1 += each;
        }
        for (int each : arr2){
            total2 += each;
        }
        if(total1 == total2){
            System.out.println("equal");
            return;
        }
        if(total1 > total2){
            System.out.println(Arrays.toString(arr1));
            return;
        }
        if(total2 > total1){
            System.out.println(Arrays.toString(arr2));
        }
    }

}
