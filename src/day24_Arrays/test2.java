package day24_Arrays;

import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {
        int[] ar1 = new int[7];
        int[] ar2 = new int[7];
        int[][] array3 = new int[2][7];
        int row=0, column=0;
        for(int i=0; i<ar1.length || ar2[6] == 0 || array3[1][6]==0; i++){
                ar1[i] = i;
                ar2[i] = i+7;
                array3[row][column] = i;
                if(column == array3[0].length-1){
                    row=1;
                    for(column=0; column<array3[1].length; column++){
                        array3[row][column] = column+7;
                    }
                }
            column++;

        }

        System.out.println(Arrays.toString(ar1));
        System.out.println(Arrays.toString(ar2));

        System.out.println(ar2[4]);

        System.out.println("**********************");


        System.out.println(Arrays.toString(array3[0]));
        System.out.println(Arrays.toString(array3[1]));
    }
}
