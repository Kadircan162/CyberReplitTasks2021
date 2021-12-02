package day24_Arrays;

import java.util.Arrays;
import java.util.Random;

public class ScoresAverageCalculator {

    public static int scoresAverage(int[] givenStringArray){
        int average = 0;
        givenStringArray = arrayLoader(givenStringArray);
        for(int i=0; i<givenStringArray.length; i++){
            average += givenStringArray[i];
        }
        System.out.println(Arrays.toString(givenStringArray));
        return average/givenStringArray.length;
    }
    public static int[] arrayLoader(int[] arrayToBeLoaded){
        Random rd = new Random();
        for (int i=0; i<arrayToBeLoaded.length; i++){
            arrayToBeLoaded[i] = rd.nextInt(100 - 50) + 51;
        }
        return arrayToBeLoaded;
    }

    public static void main(String[] args) {
        int[] scores = new int[3];
        System.out.println("Average of random scores: " + scoresAverage(scores));

    }
}
