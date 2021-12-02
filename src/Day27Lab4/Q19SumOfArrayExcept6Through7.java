package Day27Lab4;

import java.util.Arrays;

public class Q19SumOfArrayExcept6Through7 {
    public static void main(String[] args) {
        int[] intArr = {2,3,6,8,9,6,8,7,10};
        System.out.println(SumOfArray(intArr));
    }

    public static int SumOfArray(int[] arr){

        int sum=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 6){
                sum += arr[i];
            }else{
                for(int pointer = i+1; pointer < arr.length; pointer++){
                    if(arr[pointer] == 7){
                        i = pointer;
                        break;
                    }else{
                        i = arr.length;
                    }
                }
            }
        }
        return sum;
    }

}
