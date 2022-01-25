package day_47_collection_part2;

import java.util.*;

public class IteratorExample {

    public static void main(String[] args) {

        Set<Integer> mySet = new HashSet<>();
        mySet.add(43);
        mySet.add(54);
        mySet.add(421);
        mySet.add(400);
        mySet.add(650);
        mySet.add(650);

        mySet.forEach(n -> System.out.print(n + "|"));//lambda expression
        System.out.println();

        Iterator<Integer> myIt = mySet.iterator();
        System.out.println(myIt.hasNext());

        myIt.forEachRemaining(n -> System.out.print(n + "|"));//lambda expression
        System.out.println();
        myIt.forEachRemaining(n -> System.out.print(n + "|"));//lambda expression



        for (Integer integer : mySet) {
            System.out.print(integer + "|");
        }
        System.out.println();
        System.out.println(myIt.hasNext());

        for (Integer integer : mySet) {
            System.out.print(integer + "|");
        }
        System.out.println();

        //System.out.print("myIt.next() = " + myIt.next());//error: pointer is dynamically navigates for each next() method



        while (myIt.hasNext()){
            System.out.print("While loop: " + myIt.next());//pointer is dynamically navigates for each next() method
        }

        Set<Integer> mySet2 = new HashSet<>();
        mySet.add(43);
        mySet.add(54);
        mySet.add(421);
        mySet.add(400);
        mySet.add(650);

        System.out.println();
        Iterator<Integer> myIt2 = mySet2.iterator();

        System.out.println("***************************");
        while (myIt2.hasNext()){
            if(myIt2.next() > 100){
                myIt2.remove();
            }

        }

        System.out.println("mySet2 = " + mySet2);

        List<Integer> list = new ArrayList<>();
        list.add(21);
        list.add(43);
        list.add(34);
        list.add(11);
        list.add(21);
        System.out.println("list = " + list);
        for (Integer each : list) {
            if(each < 20){
                list.remove(each);
            }
        }
        System.out.println("list = " + list);

    }
}
