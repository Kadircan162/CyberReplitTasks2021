package day_47_collection_part2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LoopWhileIteratorForRemove {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(43);
        myList.add(54);
        myList.add(421);
        myList.add(400);
        myList.add(700);
        myList.add(650);
        System.out.println("*********** My list **************");
        System.out.print(myList);
        System.out.println();

        System.out.println("*********** Throws Exception when removing Integer (Object) element with regular for each loop **************");

        try {
            for (Integer each : myList) {
                if(each > 405){
                    myList.remove(each);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.print(myList);
        System.out.println();

        System.out.println("*********** Removing elements with Iteration while loop successfully **************");
        Iterator<Integer> iter1 = myList.listIterator();

        while (iter1.hasNext()){
            int val = iter1.next();
            if(val < 50){
                iter1.remove();
            }
        }
        System.out.print(myList);
        System.out.println();

        List<String> cities = new ArrayList<>();
        cities.add("New York");
        cities.add("Boston");
        cities.add("Virginia");
        cities.add("DC");
        System.out.println("***********Cities**************");
        System.out.print(cities);
        System.out.println();

        System.out.println("*********** Throws Exception when removing String (Object) element with regular for each loop **************");
        try{
            for (String city : cities) {
                if(city.equals("Boston")){
                    cities.remove(city);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(cities);
        System.out.println();

        System.out.println("*********** Removing elements with Iteration while loop **************");
        Iterator<String> iter2 = cities.listIterator();

        while (iter2.hasNext()){
            if(iter2.next().equals("Virginia")){
                iter2.remove();
            }
        }

        System.out.println(cities);

    }


}
