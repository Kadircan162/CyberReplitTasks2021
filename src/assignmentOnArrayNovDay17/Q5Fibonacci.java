package assignmentOnArrayNovDay17;

import java.util.Arrays;
import java.util.Scanner;

public class Q5Fibonacci {
    //Question 5:
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a limit for a new Fibonacci series: ");
        int[] fib = new int[input.nextInt()];
        fib[0]=0; fib[1]=1;

        for(int i=2; i<fib.length; i++){
            fib[i] = fib[i-2]+fib[i-1];
        }

        for(int i=0; i<fib.length-1; i++){
            System.out.print(fib[i] + ", ");
        }
        System.out.print(fib[fib.length-1]);

    }
}
