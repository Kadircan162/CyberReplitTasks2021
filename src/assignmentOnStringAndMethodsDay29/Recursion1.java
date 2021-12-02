package assignmentOnStringAndMethodsDay29;

import java.util.Arrays;

public class Recursion1 {
    public static void reduceByOne(int n){

        if(n >= 0) {
         reduceByOne(n-1);
        }
        System.out.println("Completed call: " + n);
    }
    public static void main(String[] args) {
        reduceByOne(10);

    }
}
