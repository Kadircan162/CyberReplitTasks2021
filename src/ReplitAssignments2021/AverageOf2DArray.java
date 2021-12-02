package ReplitAssignments2021;

import java.util.Scanner;

public class AverageOf2DArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int k = 0;
//        double total = 0;
        double avgTemp = 0;
//        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
//                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };
        double[] temps = {80, 88, 88, 84, 82, 78, 60, 68};

        for (double dummy : temps){
            avgTemp += dummy;
        }
        System.out.println(avgTemp/temps.length);
    }
}
