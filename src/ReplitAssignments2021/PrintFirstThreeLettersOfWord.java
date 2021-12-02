package ReplitAssignments2021;

import java.util.Scanner;

public class PrintFirstThreeLettersOfWord {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++)
        {
            arr[i] = input.nextLine();
        }
        //leave above alone!  write your code below.
        //Create another loop for your solution!
        for(String dummy : arr){
            System.out.println(dummy.substring(0,3));
        }

    }
}
