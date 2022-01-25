package lab4;

import java.util.Arrays;

public class SwapLastWithFirstInArray {


    public static void main(String[] args) {

        int []x= {1,2,3,4};
        System.out.println(Arrays.toString(swapFirstLast(x)));

    }



    public static int[] swapFirstLast (int[] a) {

        //int []result=new int[a.length];
        //result = a;

        int dummy = a[0];
        a[0] = a[a.length-1];
        a[a.length-1] = dummy;

        return a;

    }
}


