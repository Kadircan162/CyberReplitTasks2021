package Day27Lab4;

import java.util.Arrays;
import java.util.Random;

public class Q7PrintFirstAndLastElementIntoArray {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] intArr = {rd.nextInt(21), rd.nextInt(21), rd.nextInt(21), rd.nextInt(21)};
        System.out.println("Main array is: " + Arrays.toString(intArr));
        int[] intArr2 = {};
        intArr2 = InsertFirstAndLast(intArr, intArr2);
        System.out.println("Result array: " + Arrays.toString(intArr2));
    }

    public static int[] InsertFirstAndLast(int[] arr, int[] arr2){
        arr2 = new int[2]; // for taking only first and last elements
        arr2[0] = arr[0];
        arr2[1] = arr[arr.length-1];

        return arr2;
    }
}
