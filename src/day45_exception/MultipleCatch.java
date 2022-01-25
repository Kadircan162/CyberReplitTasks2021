package day45_exception;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class MultipleCatch {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        System.out.println("list = " + list);
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(list);
        list2.add(9);
        list2.addAll(list);
        System.out.println("list2 = " + list2);
        System.out.println(list2.containsAll(list));

        try {
            int x = 4/0;
            System.out.println("x = " + x);

            String str = null;
            System.out.println(str.toUpperCase());

            int[] num = {19, 5};
            System.out.println("num[5] = " + num[5]);

        }catch (ArithmeticException e){//there is a hierarchy here from more specific exception class to parent exception classes.
            // But if there is no parent/child relationship between exception classes, then hierarchy does not apply
            int x = 4/0;//when a code throws an exception in catch or finally block, jvm stops executing rest of the code
            System.out.println("x = " + x);
            System.out.println("ArithmeticException class called");
        }catch (NullPointerException n){
            System.out.println("NullPointerException class called");
        }catch (RuntimeException r){
            System.out.println("RuntimeException class called");
            r.printStackTrace();
        }finally {
            System.out.println("Finally blocked executes even the code throws exception in its own TRY or CATCH blocks");
        }

        try {
            System.out.println(4/0);
            Thread.sleep(1000);
        }catch (NumberFormatException | InputMismatchException e){//here there should be no parent/child relationship between exceptions in one line

        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            System.out.println("Finally blocked executes even the code throws exception in its own TRY or CATCH block");
        }
        /*
        try {
            System.out.println("try without a catch and a finally block gives compiler error");
        }
        */

    }

}
