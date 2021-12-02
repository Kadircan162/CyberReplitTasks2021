package day24_Arrays;

import java.util.Arrays;

public class SplitMethodWithArrays {
    public static void main(String[] args) {
        String pass1 = "This rs info tr is info used .Please do not share";
        String[] infoArray1 = pass1.split("info", 0);
        String[] infoArray2 = pass1.split("info");
        System.out.println(Arrays.toString(infoArray1));
        System.out.println(Arrays.toString(infoArray2));

        for (String result : infoArray1){
            System.out.println(result);
        }
        for (String result : infoArray2){
            System.out.println(result);
        }
//        System.out.println("===============");
//        pass1 = infoArray1[1].split(".Please")[0];
//        System.out.println(pass1);
//
//        System.out.println("*******************");
//        pass1 = infoArray1[1].split(".Please")[1];
//        System.out.println(pass1);
    }
}
