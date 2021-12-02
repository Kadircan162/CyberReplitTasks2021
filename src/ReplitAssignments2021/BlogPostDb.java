package ReplitAssignments2021;

import java.util.ArrayList;
import java.util.Scanner;

public class BlogPostDb {
    public static String blogDb(ArrayList<String[]> r, String id) {

        String result = "";

        for(String[] each : r){
            if(each[0].equals(id)){
                for (int i=1; i<each.length-1; i++){
                    result += each[i].concat("\n");
                }
                result = result.concat(each[each.length-1]);
            }
        }

        return result;

    }

    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String id = in.next();
        in.nextLine();
        ArrayList<String[]> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(new String[]{in.nextLine(), in.nextLine(), in.nextLine()});
        }

        System.out.println(blogDb(list, id));

    }
}
