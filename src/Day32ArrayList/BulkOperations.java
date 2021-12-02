package Day32ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BulkOperations {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        String[] newList = {"Java", "Python", "C+", "Rubby","Java"};

        list.addAll(Arrays.asList(newList));

        System.out.println("List1 = " + list);

        list.remove("Java"); // removes only one/first "Java" from the list

        System.out.println(list);

        list.removeAll(Arrays.asList("Java"));// removes all the Javas from the list

        System.out.println(list);

        System.out.println("===============================================");

        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Java", "Python", "C+", "Rubby","Java"));//calling constructor

        System.out.println("List2 = " + list2);

        //replaceAll
        Collections.replaceAll(list2,"Java", "C#");// replaces all the Java with C#

        System.out.println(list2);


    }
}
