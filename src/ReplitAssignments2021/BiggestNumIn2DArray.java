package ReplitAssignments2021;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BiggestNumIn2DArray {
    public static void main(String[] args) {
//        Scanner inp = new Scanner(System.in);
//        int rows = inp.nextInt(), cols = inp.nextInt();
//        int[][] arr = new int[rows][cols];
//        for(int i=0 ;i<=rows-1;i++){
//            for(int j=0 ;j<=cols-1;j++){
//                arr[i][j]=inp.nextInt();
//            }//end for cols
//        }//end for rows
        Random rd = new Random();
        int row=rd.nextInt(4)+3, col= rd.nextInt(4)+3;
        int[][] arr = new int[row][col];
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                arr[i][j] = rd.nextInt(50)+1;
            }
        }
        //TODO write your code below
//        if(arr[i][col-1] > arr[i+1][col-1]){
//            maxNum = arr[i][col-1];
//        }else{
//            maxNum =  arr[i+1][col-1];
//        }
//        arr[i][j] = arr[i][col-1];
        System.out.println("*******************");
        System.out.println(Arrays.deepToString(arr));
        System.out.println("*******************");
        for(int i=0; i<row; i++){
            Arrays.sort(arr[i]);
        }
        System.out.println("*******sorted************");
        System.out.println(Arrays.deepToString(arr));
        System.out.println("*******************");

        int maxNum = 0;

        for (int i=0; i<row; i++){
                maxNum = Math.max(maxNum, arr[i][col-1]);
        }

        for(int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                arr[i][j] = maxNum;
            }
        }

        //FINAL PRINT
        System.out.println(Arrays.deepToString(arr));


    }
}
