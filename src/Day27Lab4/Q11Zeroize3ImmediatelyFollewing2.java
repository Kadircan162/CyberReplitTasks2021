package Day27Lab4;

import java.util.Arrays;

public class Q11Zeroize3ImmediatelyFollewing2 {
    public static void main(String[] args) {
        int[] intArr = new int[]{3,2,3,2,3};
        Zeroize3After2(intArr);
        System.out.println(Arrays.toString(intArr));
    }

    public static void Zeroize3After2(int[] arr){

        for(int i=0; i< arr.length; i++){
            if(arr[i] == 2 && arr[i+1] == 3){
                arr[i+1] = 0;
            }
        }
    }
}
