package day_46_collection_part1;

import java.util.*;

public class ArrayvsArrayList {
    public static void main(String[] args) {
        int[] numsArray = {30,50,100,5,6};
        String[] days = new String[7];
        days[0] = "Monday";

        Object[] obj = new Object[]{2, "apple", false};

        ArrayList<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Collection<Integer> list3 = new ArrayList<>();

        list1.add(40);
        list1.add(80);
        list1.add(110);
        list1.add(40);
        list1.add(30);

        System.out.println("numsArray[0] = " + numsArray[0]);
        System.out.println("days[0] = " + days[0]);
        System.out.println("obj[1] = " + obj[1]);
        System.out.println("list1.get(2) = " + list1.get(2));
        System.out.println("list1.indexOf(110) = " + list1.indexOf(110));
        System.out.println("list1.lastIndexOf(40) = " + list1.lastIndexOf(40));

        CompareElementsProduct product = new CompareElementsProduct("Mike", 40);
        System.out.println("product.toString() = " + product.toString());
        System.out.println("product.toString() = " + product);

    }

}
