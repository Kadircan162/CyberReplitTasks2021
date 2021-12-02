package Day27Lab4;

import java.util.Arrays;

public class Q15SwapFirstAndLastElements {
    public static void main(String[] args) {
        int[] intArr = {8,6,7,9,5};
        SwapFirstAndLastElements(intArr);
        System.out.println(Arrays.toString(intArr));
    }

    public static void SwapFirstAndLastElements(int[] arr){
            int dummy = arr[0];
            arr[0] = arr[arr.length-1];
            arr[arr.length-1] = dummy;
    }
}
