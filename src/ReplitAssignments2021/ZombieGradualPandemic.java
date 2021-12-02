package ReplitAssignments2021;

import java.util.Arrays;

public class ZombieGradualPandemic {
    public static void main(String[] args) {
        int[] inhabitants = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
        int totalOfElements;
        int day=0;

        do{
            System.out.println("Day " + day++ + " " + Arrays.toString(inhabitants));
            totalOfElements=0;
            int j=0;
            int[] zeroIndex = new int[0];
            int[] zeroIndexDummy;
             for(int i=0; i< inhabitants.length; i++){
                 if(inhabitants[i] == 0){
                     zeroIndexDummy = zeroIndex;
                     zeroIndex = new int[j+1];
                     int m=0;
                     for(int each : zeroIndexDummy){
                         zeroIndex[m++] = each;
                     }
                     zeroIndex[j] = i;
                     j++;
                 }
             }
             for(int k=0; k<zeroIndex.length; k++){
                 if(zeroIndex[k] == 0){
                    inhabitants[zeroIndex[k]+1] = inhabitants[zeroIndex[k]+1] / 2;
                 }else if(zeroIndex[k] == inhabitants.length-1){
                    inhabitants[zeroIndex[k]-1] = inhabitants[zeroIndex[k]-1] / 2;
                 }else{
                     inhabitants[zeroIndex[k]-1] = inhabitants[zeroIndex[k]-1] / 2;
                     inhabitants[zeroIndex[k]+1] = inhabitants[zeroIndex[k]+1] / 2;
                 }

             }
             for(int each : inhabitants){
                totalOfElements += each;
            }

        }while (totalOfElements != 0);

        System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
        System.out.println("---- EXTINCT ----");
    }
}
