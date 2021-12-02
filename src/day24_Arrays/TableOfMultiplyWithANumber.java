package day24_Arrays;

import java.util.Arrays;

public class TableOfMultiplyWithANumber {
    public static void main(String[] args) {
        int[] table = new int[10];
        int[] multiplyWith = new int [10];
        boolean flag = false;
        for(int i=0; i<table.length-1; i++){
            table[i] = i+1;
            System.out.println("Table " + table[i]);
            System.out.println("========");

            for(int j=0; j<multiplyWith.length; j++){
                multiplyWith[j] = j+1;
                System.out.println(table[i] + "x" + multiplyWith[j] + " = "+ table[i]*multiplyWith[j]);
            }
            System.out.println();
        }

    }
}
