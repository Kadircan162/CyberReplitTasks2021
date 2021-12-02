package ReplitAssignments2021;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchAndFetchWholeElement {
    public static String search(ArrayList<String> r, String find) {

        for(String each : r){
            if(each.contains(find)){
                return each;
            }
        }
        return "search failed";
    }//end wineSeller


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String find = in.next();
        in.nextLine();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextLine());
        }
        System.out.println(search(list, find));
    }
}
