package ReplitAssignments2021;

import java.util.ArrayList;
import java.util.Scanner;

public class Nanuk {
    public static boolean nanuk(ArrayList<String> r,int way_stones,int boast) {
        int totalBoast = 0;
        int nanuks = 0;
        for(String each : r){
            if(each.equals("nanuk")){
                nanuks++;
            }else{
                totalBoast += Integer.parseInt(each);
            }
        }
        if(totalBoast >= boast && nanuks <= way_stones){
            return true;
        }
        return false;

    }

    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int stones = in.nextInt();
        int boast = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(nanuk(list, stones, boast));

    }
}
