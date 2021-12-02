package Day27Lab4;

import java.util.Arrays;

public class Q28CreateArrayWithStartEndPoint {

    public static void main(String[] args) {
        int[] intArr = fizzArray(1,3);
        System.out.println(Arrays.toString(intArr));

    }
    public static int[] fizzArray(int start, int end){
        int[] arr = new int[end-start];

        for (int i=0; i<arr.length; i++){
            arr[i] = start++;
        }
        return arr;
    }
}
