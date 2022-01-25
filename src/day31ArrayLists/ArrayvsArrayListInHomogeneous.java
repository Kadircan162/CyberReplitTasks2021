package day31ArrayLists;

import java.util.ArrayList;

public class ArrayvsArrayListInHomogeneous {
    public static void main(String[] args) {



        ArrayList list2 = new ArrayList<>();
        list2.add("a");
        list2.add(1);    // OK
        list2.add(new Object());
        System.out.println("list = " + list2);

        try {
            Object[] array = new String[3];
            array[0] = "a";
            array[1] = 1;   // throws java.lang.ArrayStoreException
        }catch (ArrayStoreException a){
            a.printStackTrace();
        }


    }
}
