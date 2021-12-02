package ReplitAssignments2021;

import java.util.Arrays;

public class ZombieAttack {
    public static void main(String[] args) {
        int[] inhabitants = new int[]{3, 6, 0, 4, 3, 2, 7, 0};
        int totalOfElements;
        int day=0;

        do{
            totalOfElements=0;
            System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
            for (int j=0; j < inhabitants.length; j++){
                inhabitants[j] = inhabitants[j] / 2;
                totalOfElements += inhabitants[j];
            }
            day++;
        }while (totalOfElements>0);
        System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
        System.out.println("---- EXTINCT ----");
    }
}
