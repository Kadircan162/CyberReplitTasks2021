package ReplitAssignments2021;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},{scan.nextInt(), scan.nextInt(), scan.nextInt()},
//                {scan.nextInt(), scan.nextInt(), scan.nextInt()}};
        Random rd = new Random();
        //int[][] matrix = new int[][]{{1,2,3}, {4,5,6},{9,8,7}};
        int[][] matrix = new int[][]{ {rd.nextInt(10), rd.nextInt(10), rd.nextInt(10)},{rd.nextInt(10),
                rd.nextInt(10), rd.nextInt(10)}, {rd.nextInt(10), rd.nextInt(10), rd.nextInt(10)}};
        int result = 0;
        System.out.println(Arrays.deepToString(matrix));
        int j=0;
            for(int i=0; i<matrix[0].length; i++){
                    result += matrix[i][j];
                    j++;
            }
            j=0;
            for(int i=matrix[0].length-1; i>=0; i--){
                result -= matrix[i][j];
                j++;
            }

        // FINAL PRINT
        System.out.println(Math.abs(result));
    }
}
