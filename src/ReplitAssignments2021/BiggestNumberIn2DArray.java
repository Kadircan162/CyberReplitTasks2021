package ReplitAssignments2021;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BiggestNumberIn2DArray {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Random rd =new Random();
       // int rows = inp.nextInt(), cols = inp.nextInt();
        int rows = rd.nextInt(5)+2, cols = rd.nextInt(10)+2;
        int[][] arr = new int[rows][cols];
        for(int i=0 ;i<=rows-1;i++)
        {
            for(int j=0 ;j<=cols-1;j++)
            {
                arr[i][j]=rd.nextInt(50);
            }//end for cols
        }//end for rows
        for(int i=0; i<rows; i++){
                System.out.println(Arrays.toString(arr[i]));
        }

        //TODO write your code below
        int biggest = 0;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(biggest < arr[i][j]){
                    biggest = arr[i][j];
                }
            }
        }

        System.out.println(biggest);

    }//end main
}
