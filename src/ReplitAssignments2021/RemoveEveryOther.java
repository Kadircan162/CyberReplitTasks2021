package ReplitAssignments2021;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveEveryOther {

        //create your method below
        public static ArrayList<String> removeEveryOther(ArrayList<String> list){

            for(int i=0; i<list.size(); i++){
                list.remove(i);
            }
            return list;
        }

        // Do not touch below

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int size = in.nextInt();
            ArrayList<String> list = new ArrayList<>();
            for(int i=0; i < size; i++) {
                list.add(in.next());
            }

            System.out.println(removeEveryOther(list));

        }
    }
