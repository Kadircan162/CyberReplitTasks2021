package Day27Lab4;

import java.util.Arrays;

public class Q29MultiplyByTen {
    public static void main(String[] args) {
        int[] intArr = {2,10,3,4,1,20,0,0};
        System.out.println(Arrays.toString(tenRun(intArr)));
    }
    public static int[] tenRun(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]%10 == 0 && (arr[i+1]%10 != 0 || arr[i+1] == 0)){
                arr[i+1] = arr[i];
            }
        }
        return arr;
    }
}
