package Day27Lab4;

import java.util.Arrays;

public class Q23CreateArrayWithGivenNumberLength {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(CreateArrayWithGivenNumberOfLength(10)));
    }
    public static int[] CreateArrayWithGivenNumberOfLength(int n){
        int [] newArray = new int[n];
        for (int i=0; i<newArray.length; i++){
            newArray[i] = i;
        }
        return newArray;
    }
}
