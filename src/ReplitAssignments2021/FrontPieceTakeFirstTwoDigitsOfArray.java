package ReplitAssignments2021;

import java.util.Arrays;

public class FrontPieceTakeFirstTwoDigitsOfArray {
    public static void main(String[] args) {
        int[] num = {1,3,5};
        int[] newNum = null;
        if(num.length<2){
            newNum = num;
        }else{
            newNum = new int[2];
            for(int i=0; i<newNum.length; i++){
                newNum[i] = num[i];
            }
        }
        System.out.println(Arrays.toString(newNum));
    }
}
