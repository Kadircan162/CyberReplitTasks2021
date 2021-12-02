package Day27Lab4;

import java.util.Arrays;

public class Q14CopyTwoArrays {
    public static void main(String[] args) {
        int[] intArr1 = {1,2,3};
        int[] intArr2 = {3,4,5,6};

        System.out.println(Arrays.toString(CopyTwoArrays(intArr1, intArr2)));
    }
    public static int[] CopyTwoArrays(int[] arr1, int[] arr2){
        int[] newArr = new int[arr1.length + arr2.length];
        for (int i=0; i< arr1.length; i++){
            newArr[i] = arr1[i];
        }
        for (int i=0; i< arr2.length; i++){
            newArr[arr1.length+i] = arr2[i];
        }
        return newArr;
    }
}
