package day_47_collection_part2;

import java.util.*;

public class SetExample {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(64);
        set.add(500);
        set.add(100);
        set.add(2000);
        set.add(500);
        set.add(64);
        System.out.println("set = " + set);//only unique elements are kept in Set list
        System.out.println("set.size() = " + set.size());

        for (Integer integer : set) {
            System.out.println("integer = " + integer);
        }

        List<String> myList = Arrays.asList("tt", "er", "43", "bb", "d", "43", "false", "re", "re");
        System.out.println("myList = " + myList);//Lets duplicates and lists in order

        Set<String> mySet = new HashSet<>(myList);
        System.out.println("mySet = " + mySet);//duplicates are gone and listed not in order


        TreeSet<Integer> myTreeSet = new TreeSet<>(set);//TreeSet implements SortedSet interface
        System.out.println("myTreeSet = " + myTreeSet);//Duplicates are not allowed and the elements are sorted in ascending way

        QueueExample q1 = new QueueExample();
        QueueExample q2 = q1;
        System.out.println(q1 + " | " + q2 + " | ");

        Set<QueueExample> set2 = new HashSet<>();
        set2.add(q1);
        set2.add(q2);//duplicates are rendered
        System.out.println("set2 = " + set2);//duplicates are rendered in Set data structure


    }
}
