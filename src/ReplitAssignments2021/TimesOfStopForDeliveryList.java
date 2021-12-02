package ReplitAssignments2021;

import java.util.ArrayList;
import java.util.Scanner;

public class TimesOfStopForDeliveryList {
    public static int refuel_times(ArrayList<Integer> deliveries,int max_fuel) {

        int stop = 0;
        for(Integer each : deliveries){
            for(int i=0; i<(double)each/max_fuel; i++){ //If need of fuels for a delivery is less than max_fuel,
                                                            // double variable need to get a value above int '0'
                stop++;
            }
        }

        return stop;
    }

    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int fuel = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(refuel_times(list, fuel));

    }
}
