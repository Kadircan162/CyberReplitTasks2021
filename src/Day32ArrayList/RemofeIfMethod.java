package Day32ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemofeIfMethod {
    public static void main(String[] args) {
        ArrayList<String> color_list;


        color_list = new ArrayList<>();

        // use add() method to add values in the list
        color_list.add("White");
        color_list.add("Black");
        color_list.add("Red");
        color_list.add("White");
        color_list.add("Yellow");
        color_list.add("White");

        System.out.println("List of Colors");
        System.out.println(color_list);

        // 2 ways of removing all "White" colors from color_list

        // 1. Way: using removeIf() method
        color_list.removeIf(color -> color.equals("White"));

        // 2. Way: using removeAll() method
        color_list.removeAll( Arrays.asList("White")  );

        System.out.println("Color list, after removing White colors :");
        System.out.println(color_list);

    }
}
