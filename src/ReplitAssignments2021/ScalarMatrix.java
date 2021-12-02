package ReplitAssignments2021;

import java.util.Arrays;

public class ScalarMatrix {
    public static int[][] scalar(int[][] matrix ,int n) {

        for(int i=0; i<matrix.length; i++){
            int j=0;
            for(int each : matrix[i]){
                matrix[i][j++] = each*n;
            }
        }
        return matrix;
    }

    public static void main(String[] args)
    {

        int [][] i= new int[][]
                {
                        {1,1,1},
                        {1,1,1}
                };
        i = scalar(i,2);
        System.out.println(Arrays.deepToString( i ));

    }//end main
}
