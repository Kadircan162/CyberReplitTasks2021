package ReplitAssignments2021;

import java.util.Scanner;

public class JudgeScoresForDiving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        //WRITE YOUR CODE HERE
        float total = 0.0f;
        for(int i=0; i<score.length; i++){
            System.out.println("Enter score for judge " + i+1 + ":");
            score[i] = input.nextFloat();
            total += score[i];
        }
        System.out.println("Enter difficulty:");
        float diff = input.nextFloat();
        System.out.println(diff);
        total = total - score[0];
        total = total - score[score.length-1];
        total = total * diff;
        total = total * 0.6f;

       //total = (float)((total - (score[0] + score[score.length-1])) * diff * 0.6);

        // FINAL OUTPUT
        System.out.printf("Total: %.2f", total);
    }
}
