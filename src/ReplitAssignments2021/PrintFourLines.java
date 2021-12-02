package ReplitAssignments2021;

import java.util.Scanner;

public class PrintFourLines {
    public static void main(String[] args) {
        //String[] arr = {"apple", "banana", "kiwi", "grape", "milk", "soda", "juice", "coffee"};
        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for(int i=0; i<arr.length; i++){
            arr[i] = input.nextLine();
        }
        for (int i=0; i<arr.length-1; i+=2){
            System.out.println(arr[i] + ", " + arr[i+1]);
        }
    }
}
