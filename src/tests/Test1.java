package tests;

import java.util.ArrayList;
import java.util.Arrays;

public class Test1 {
    private double d = 9.1;
    Test1(){

    }
    public static void main(String[] args) {
        Boolean b1 = Boolean.parseBoolean("true");
        System.out.println(b1);
        Boolean b2 = Boolean.valueOf("false");
        System.out.println(b2);

        System.out.println("************************");
        boolean pb1 = Boolean.parseBoolean("true");
        System.out.println(pb1);
        boolean pb2 = Boolean.valueOf("false");
        System.out.println(pb2);

        System.out.println("---------------------------");
        Integer i1 = Integer.parseInt("1");
        System.out.println(i1);
        Integer i2 = Integer.valueOf("1");
        System.out.println(i2);
        System.out.println("((((((((((((((((((((((((((((((((((((((((");
        Integer i3 = 128; // false --> if int literal is 128 and higher, two different objects are created in heap so address are differenet
        Integer i4 = 128;
        System.out.println(i3 == i4);

        Integer i5 = 127; // true --> however, if int literal is between 127 - (-128), then only one object is created in heap (like a String pool) so address are same
        Integer i6 = 127;
        System.out.println(i5 == i6);

        Boolean b3 = true;
        Boolean b4 = true;
        System.out.println(b2 == b4);
        System.out.println("))))))))))))))))))))))))))))))))))))))))");

        int pi1 = Integer.parseInt("1");
        System.out.println(pi1);
        int pi2 = Integer.valueOf("1");
        System.out.println(pi2);
        int pi3 = Integer.compare(3,5);
        System.out.println(pi3);

        int pi4 = Integer.compare(pi1, pi2);
        System.out.println(pi4);

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println(Integer.parseInt("1"));
        System.out.println(Integer.valueOf("1"));

        Double d1 = new Double(3.3);
        Double d2 = Double.valueOf("4.5");

       ArrayList<String> list1 = new ArrayList<>();
       //ArrayList<Integer> list2 = new ArrayList<>(list1); //error

        list1.add("Apple");list1.add("orange");list1.add("banana");list1.add("kiwi");
        for (String each : list1){
            System.out.println(each);
        }
        System.out.println(list1);







    }
}
