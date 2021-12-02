package Day27Lab4;

import java.awt.desktop.SystemEventListener;
import java.util.Arrays;
import java.util.Random;

public class Q6GreatestElement {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] intArr = {rd.nextInt(21), rd.nextInt(21), rd.nextInt(21), rd.nextInt(21)};
        System.out.println(Arrays.toString(GreatistElement(intArr)));
    }
    public static int[] GreatistElement(int[] arr){
        int[] result = new int[arr.length];
        System.arraycopy(arr, 0, result, 0, arr.length);

        int greatest = Integer.MIN_VALUE;

        for(int each : result){
            if(each > greatest){
                greatest = each;
            }
        }
        Arrays.fill(result, greatest);
        return result;
    }
}
