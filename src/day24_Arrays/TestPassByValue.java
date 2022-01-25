package day24_Arrays;

import java.util.ArrayList;
import java.util.List;

public class TestPassByValue {

    static int X;

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Orange");
        list.add("Apple");
        list.add("Mellon");

        m1(list);

        System.out.println(list);


    }

    public static void m1(List<String> list2){

        list2.add("Banana");



    }

    static {

    X = 10;
    }
}

