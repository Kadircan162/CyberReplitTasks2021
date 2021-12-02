package assignmentOnArrayNovDay17;

import java.util.Arrays;
import java.util.Scanner;

public class Q3SearchCharacterInArray {
    //Question 3:
    public static void main(String[] args) {
        char arr [] = new char[] {'A', 'Z', 'B', 'N', 'P', 'T', 'X', 'C'};
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a letter to search: ");
        String letter = input.next();
        int i=0;
        for (char each : arr){
            i++;
            if((""+each).equalsIgnoreCase(letter)){
                System.out.println(letter + " found!");
                break;
            }
            if(i == arr.length){
                System.out.println(letter + " Not found!");
            }
        }
    }
}
