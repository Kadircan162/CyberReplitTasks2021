package ReplitAssignments2021;

import java.util.Arrays;

public class ZombieGradualPandemic2ndWay {
    public static void main(String[] args) {
        int[] inhabitants = new int[]{0, 6, 0, 33, 0, 2, 0, 0, 0}; //0,0,0,0,0,0,0,0
        int totalOfElements=0; //to count total of ridden cities -- if zero then EXTINCT
        int day=0;

        for(int i=0; i< inhabitants.length; i++){
            totalOfElements += inhabitants[i];
        }

        while (totalOfElements != 0){
            System.out.println("Day " + day++ + " " + Arrays.toString(inhabitants));
            totalOfElements=0;
            int[] inhabitDummy = new int[inhabitants.length]; // holds city population changes
            int[] indexArr = new int[inhabitants.length*2]; // holds changed cities' index numbers
            int j=0;
            int numberOfChange=0;
             for(int i=0; i< inhabitants.length; i++){
                 if(inhabitants[i] == 0){

                     if(i == 0){ //seek to find if zero is the first element of array
                         inhabitDummy[i+1] = inhabitants[i+1] / 2;
                         indexArr[j] = i+1;
                         numberOfChange++;
                     }else if(i == inhabitants.length-1){ //seek to find if zero is the last element of array
                         inhabitDummy[i-1] = inhabitants[i-1] / 2;
                         indexArr[j] = i-1;
                         numberOfChange++;
                     }else{
                         inhabitDummy[i+1] = inhabitants[i+1] / 2;
                         inhabitDummy[i-1] = inhabitants[i-1] / 2;
                         indexArr[j] = i-1;
                         numberOfChange++;
                         indexArr[++j] = i+1;
                         numberOfChange++;
                     }
                     j++;
                 }
             }

            for(int n=0; n<numberOfChange; n++){
               inhabitants[indexArr[n]] = inhabitDummy[indexArr[n]]; //DayX is completed and inhabitants array is updated
            }
            numberOfChange = 0;

            for(int i=0; i< inhabitants.length; i++){
                totalOfElements += inhabitants[i];
            }
        }
        System.out.println("Day " + day++ + " " + Arrays.toString(inhabitants));
        System.out.println("---- EXTINCT ----");
    }
}
