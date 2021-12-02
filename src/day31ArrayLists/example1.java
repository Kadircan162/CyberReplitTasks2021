package day31ArrayLists;

import assignmentOnStringAndMethodsDay29.Q1TipCalculator;
import assignmentOnStringAndMethodsDay29.Q2LaptopPrice;
import assignmentOnStringAndMethodsDay29.Q3WordGame;

import java.util.ArrayList;
import java.util.Arrays;

public class example1 {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>(15);
        languages.add("English");
        languages.add("Arabic");
        System.out.println(languages.get(1));
        System.out.println(languages.toString());
        languages.add("Turkish");
        languages.add(0, "Dutch");
        languages.add(4, "French");
        languages.add(5, "Spanish");
        languages.add(6, "Esperanto");
        System.out.println("|||||||||||||||||||||||||||<<");

        ArrayList<String> newLang = languages;
        System.out.println(newLang);
        newLang.add("Russian");
        System.out.println(languages + " " + newLang);

        System.out.println(languages.toString());
        System.out.println(languages.size());
        languages.remove("French");
        System.out.println(languages.toString());

        ArrayList<Integer> numbers = new ArrayList<>();


        numbers.add(5);
        numbers.add(6);

        Integer i = new Integer(5);
        Integer j = new Integer(5);
        Integer k = new Integer(5);

        Q2LaptopPrice q2 = new Q2LaptopPrice();

        Object[] i1 = {i, j, k, q2};
        ArrayList<Object> ob1 = new ArrayList<>(5);

        ob1.add(i);
        ob1.add(j);
        ob1.add(k);
        ob1.add(q2);
        System.out.println(ob1);
        ob1.remove(q2);
        System.out.println(ob1);
        ob1.remove(k);
        System.out.println(ob1);

        ArrayList<Integer> numsList = new ArrayList<>();
        numsList.add(10);
        numsList.add(5);
        numsList.add(5);
        numsList.add(6);
        numsList.add(3);
        numsList.add(2);

        for(int each : numsList){
            System.out.print(each + " ");
        }
        int prim1 = numsList.get(0);
        System.out.println(prim1);






        System.out.println(i1[1]);

        numbers.remove(i);
        numbers.remove(new Integer(6));
        System.out.println(numbers.toString());








    }


}
