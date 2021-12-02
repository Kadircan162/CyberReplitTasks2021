package Day27Lab4;

import java.util.Arrays;
import java.util.Random;

public class Q4SumOfElements {
    public static void main(String[] args) {
        int[] intArr = new int[6];
        Random rd = new Random();

        for(int i = 0; i<intArr.length; i++){
            intArr[i] = rd.nextInt(20);
        }
        System.out.println(Arrays.toString(intArr));

        System.out.println(SumOfElements(intArr));
    }
    public static int SumOfElements (int[] i){
        int total = 0;
        for(int each : i){
            total += each;
        }
        return total;
    }
}
