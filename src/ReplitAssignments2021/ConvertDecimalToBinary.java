package ReplitAssignments2021;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertDecimalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //int decimal = input.nextInt();
        int decimal = 127;
        int[] binary = new int[8];

        //TODO: Write your code below.
        for(int i=0; i< binary.length; i++){
           if(decimal / (int)Math.pow(2, 7-i) != 0){
               binary[i] = 1;
               decimal = decimal % (int)Math.pow(2, 7-i);
           }else{
               binary[i] = 0;
           }
        }
        System.out.println(Arrays.toString(binary));
    }
}
