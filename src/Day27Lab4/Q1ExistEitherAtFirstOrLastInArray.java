package Day27Lab4;

import java.util.Arrays;

public class Q1ExistEitherAtFirstOrLastInArray {
    public static void main(String[] args) {
        System.out.println(FirstOrLastElement(new int[]{0,3,4,6,5,7}));
        System.out.println("****************************");
        int[] arr = new int[]{6,5,8};
        System.out.println(FirstOrLastElement(arr, 6));
    }
    public static boolean FirstOrLastElement(int[] arr){
        if(arr.length < 1){
            return false;
        }
        int checkElement = 6;
        if(arr[0] == checkElement || arr[arr.length-1] == checkElement){
            return true;
        }
        return false;
    }
    public static boolean FirstOrLastElement(int[] arr, int checkElement){
        if(arr.length < 1){
            return false;
        }
        System.out.println(Arrays.binarySearch(arr, checkElement));

        if(Arrays.binarySearch(arr, checkElement) == 0){
            return true;
        }
        return false;
    }
}
