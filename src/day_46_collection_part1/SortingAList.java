package day_46_collection_part1;

import java.util.*;

public class SortingAList{

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("js");
        list.add("html");
        list.add("ruby");
        list.add("kotlin");
        list.add("c++");

        System.out.println("Before sorting the list");
        System.out.println("list.toString() = " + list.toString());
        System.out.println("list = " + list);

        Collections.sort(list);//String class also implements Comparable interface
        System.out.println("After sorting the list");
        System.out.println("list = " + list);

        List<CompareElementsProduct> prodList = new ArrayList<>();
        prodList.add(new CompareElementsProduct("spoon", 100));
        prodList.add(new CompareElementsProduct("bag", 50));
        prodList.add(new CompareElementsProduct("shoes", 59.99));
        prodList.add(new CompareElementsProduct("computer", 2100.99));

        System.out.println("Product list before sorting = " + prodList);

        //Collections.sort();//argument List<T> goes here. To do this we have to use polymorphism to make List<Product> like List<T>
        /*Comparable<> interface imposes a total ordering on the objects of each class that implements it. This ordering is referred to as the class's
        natural ordering, and the class's compareTo method is referred to as its natural comparison method. Lists (and arrays) of objects that
        implement this interface can be sorted automatically by Collections.sort (and Arrays.sort). System.out.println("Product list after
        sorting = " + prodList);*/

        Collections.sort(prodList);//here prodList is List<T>, T is the Product class that implements Comparable Interface
        System.out.println("Product list after sorting = " + prodList);

        //compareTo method of Product class implemented from Comparable<T> class
        CompareElementsProduct p1 = new CompareElementsProduct("spoon", 13.35);

        System.out.println("**************************");
        System.out.println("p1.getClass() = " + p1.getClass());
        System.out.println("p1.getClass().getName() = " + p1.getClass().getName());
        System.out.println("p1.getClass().getSimpleName() = " + p1.getClass().getSimpleName());
        System.out.println("**************************");

        CompareElementsProduct p2 = new CompareElementsProduct("fork", 20.75);
        System.out.println("Compare two product objects= " + p1.compareTo(p2));

        int compareResult = p1.compareTo(p2);
        if(compareResult == 1){
            System.out.println("P1 is more expensive");
        }else if(compareResult == 0){
            System.out.println("P1 equals P2");
        }else {
            System.out.println("P2 is more expensive");
        }



    }
}
