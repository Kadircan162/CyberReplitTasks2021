package ReplitAssignments2021;

import java.util.Arrays;

public class t2 {
    public static void main(String[] args) {

        int [] intArr ={15,30,45,60,75};
        intArr[2] = intArr[4];
        intArr[4]=90;
        System.out.println(Arrays.toString(intArr));

    }
}