package Day27Lab4;

import java.util.Arrays;

public class Q9DoubleTheLength {
    public static void main(String[] args) {
        int[] intArr = {4,5,6};
        DoubleTheLength(intArr);
    }
    public static void DoubleTheLength(int[] arr){
        int dummy = arr[arr.length-1];
        arr = new int[arr.length*2];
        arr[arr.length-1] = dummy;
        System.out.println(Arrays.toString(arr));
    }
}
