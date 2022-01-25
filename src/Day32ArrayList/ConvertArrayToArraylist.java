package Day32ArrayList;

import java.util.*;

public class ConvertArrayToArraylist {

    static String[] sarr = {"a","b","c","d","e"};

    static List<String> list;

    static List<String> list2 = new ArrayList<>();

    static Collection<String> list3 = new ArrayList<>();

    static List<String> list4 = new ArrayList<>();

    static List<String> list5 = new ArrayList<>();

    static List<String> list6 = new ArrayList<>();

    static List<String> list7 = new ArrayList<>();


    public static void main(String[] args) {
        System.out.println("========1=====");
        list = Arrays.asList(sarr);
        System.out.println("list = " + list); //List<String> list = Arrays.asList(sarr);

        System.out.println("========2=====");
        list2 = Arrays.asList(sarr); //static List<String> list2 = new ArrayList<>();
        System.out.println("list2 = " + list2);

        System.out.println("==========3==========");
        list3 = Arrays.asList(sarr); //Collection<String> list3 = new ArrayList<>();
        System.out.println("list3 = " + list3);

        System.out.println("===========4=========");
        Collections.addAll(list4, sarr);//List<String> list4 = new ArrayList<>();
        System.out.println("list4 = " + list4);

        System.out.println("===========5==========");
        Collections.addAll(list5, "a","b","c","d","e");//List<String> list5 = new ArrayList<>();
        System.out.println("list5 = " + list5);

        System.out.println("============6==========");
        for(String each : sarr){
            list6.add(each);
        }
        System.out.println("list6 = " + list6);



    }

    protected void m1(){

    }

}


