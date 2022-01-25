package day_46_collection_part1;

import java.util.ArrayList;

public class ArrayvsArrayListInHomogeneous {
    public static void main(String[] args) {

        ArrayList list2 = new ArrayList<>();
        list2.add("a");
        list2.add(1);    // OK
        list2.add(new Object());
        System.out.println("list = " + list2); //ArrayList is heterogeneous

        try {
            Object[] array = new String[3];
            array[0] = "a";
            array[1] = 1;   // throws java.lang.ArrayStoreException since Array is homogeneous
        }catch (ArrayStoreException a){
            a.printStackTrace();
        }


    }
}
