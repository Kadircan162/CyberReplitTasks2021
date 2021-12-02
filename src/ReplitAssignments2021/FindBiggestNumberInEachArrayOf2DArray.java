package ReplitAssignments2021;

import java.util.Arrays;

public class FindBiggestNumberInEachArrayOf2DArray {
    public static void main(String[] args) {
        int[][] arr = {{12, 99, 15}, {5, 45, 8}, {6, 4, 8}};
        int max =0;
        int[] maxArray = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            int j=0;
            for(; j<arr[i].length; j++){
                if(max < arr[i][j]){
                    max = arr[i][j];
                }
            }
            maxArray[i] = max;
            max = 0;
        }
        System.out.println(Arrays.toString(maxArray));
    }
}
