package Day27Lab4;

import java.util.Arrays;

public class Q30NotAloneNumberInArray {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,2,7,2,5};
        int n = 2;
        System.out.println(Arrays.toString(NotAlone(intArr, n)));

    }
    public static int[] NotAlone(int[] arr, int n){
        int[] newArr = new int[arr.length];

        System.arraycopy(arr, 0,newArr,0,newArr.length);
        System.out.println(Arrays.toString(newArr));

        for(int i=1; i<newArr.length-1; i++){
            if(arr[i] == n){
                if(arr[i-1] > arr[i+1]){
                    newArr[i] = arr[i-1];
                }else{
                    newArr[i] = arr[i+1];
                }
            }
        }
        return newArr;
    }
}
