package ReplitAssignments2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TwoTimes {
        //create your method below

        public static ArrayList<Integer> twoTimes(ArrayList<Integer> list) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            int repeatTime = 2;
            for (Integer each : list) {
                for (int i = 0; i < repeatTime; i++) {
                    arrayList.add(each);
                }
            }
            return arrayList;
        }

        // Do not touch below

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int size = in.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                list.add(in.nextInt());
            }
            System.out.println(twoTimes(list));

        }
}
