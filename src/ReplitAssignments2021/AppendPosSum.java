package ReplitAssignments2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AppendPosSum {
    //create your method below

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> arrayList){
        ArrayList<Integer> resultArrList = new ArrayList<>();
        int totalOfPos = 0;

        for (int each : arrayList){
            if(each > 0){
                resultArrList.add(each);
                totalOfPos += each;
            }
        }
        resultArrList.add(totalOfPos);
        return resultArrList;
    }

    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(appendPosSum(list));

    }
}
