package ReplitAssignments2021;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiplyByTwo {
    //create your method below

    public static ArrayList<Integer> timesTwo(ArrayList<Integer> nums){
        ArrayList<Integer> newArrList = new ArrayList<>();

        for(Integer each : nums){
            newArrList.add(each*2);
        }

        return newArrList;

    }

    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(timesTwo(list));

    }
}
