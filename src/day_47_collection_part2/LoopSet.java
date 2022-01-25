package day_47_collection_part2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LoopSet {
    public static void main(String[] args) {

        Set<Integer> mySet = new HashSet<>();
        mySet.add(43);
        mySet.add(54);
        mySet.add(421);
        mySet.add(400);
        mySet.add(650);
        mySet.add(650);

        System.out.print(mySet);
        System.out.println();

        for (Integer integer : mySet) {
            System.out.print(integer + "|");
        }
        System.out.println();

        mySet.forEach(n -> System.out.print(n + "|"));
        System.out.println();
        mySet.removeIf(n -> n<100);
        System.out.println(mySet);
    }
}
