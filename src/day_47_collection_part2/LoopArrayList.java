package day_47_collection_part2;

import java.util.ArrayList;
import java.util.List;

public class LoopArrayList {


    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(32);
        myList.add(45);
        myList.add(1123);
        myList.add(436);
        myList.add(687);

        for (int each : myList) {
            System.out.print(each + "|");
        }

        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + "|");
        }
        System.out.println();
        //forEach loop method (lambda expression)
        myList.forEach(eachItem -> System.out.print(eachItem + "|"));
        System.out.println();
        myList.removeIf(eachItem -> eachItem > 500);
        myList.forEach(eachItem -> System.out.print(eachItem + "|"));


    }

}
