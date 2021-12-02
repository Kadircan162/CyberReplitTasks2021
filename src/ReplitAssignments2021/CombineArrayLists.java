package ReplitAssignments2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CombineArrayLists {
    //create your method below
    public static ArrayList<Integer> combineAL(ArrayList<Integer> wordList1, ArrayList<Integer> wordList2){
        ArrayList<Integer> combined = new ArrayList<>();
        combined.addAll(wordList1);
        combined.addAll(wordList2);


        return combined;

    }

    // Do not touch below


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int size2 = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }
        for(int i=0; i < size2; i++) {
            list2.add(in.nextInt());
        }

        System.out.println(combineAL(list, list2));

    }
}
