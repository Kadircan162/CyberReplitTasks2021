package Day27Lab4;

import java.util.Arrays;

public class Q20TwoSideBySide {
    public static void main(String[] args) {
        int[] intArr = {2,1,3,2,2};
        System.out.println(TwoSideBySide(intArr));
    }
    public static boolean TwoSideBySide(int[] arr){

        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == 2 && arr[i+1] == 2){
                return true;
            }
        }
        return false;
    }
}
