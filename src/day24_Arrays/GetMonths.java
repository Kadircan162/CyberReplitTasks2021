package day24_Arrays;

import java.text.DateFormatSymbols;
import java.util.Arrays;
import java.util.Scanner;

public class GetMonths {
    public static void main(String[] args) {

        DateFormatSymbols dfs = new DateFormatSymbols();
        String[] months = dfs.getMonths();
        System.out.println(getMonths(0));

        String[] months2 = new String[12];

        for(int i=0; i<months2.length; i++){
            months2[i] = getMonths(i);
            System.out.println(months[i]);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println(months2[sc.nextInt()-1]); // user does not care array index and can write 1 for January
        System.out.println("****************");
        System.out.println(Arrays.toString(months2));


    }
    public static String getMonths(int monthNumber){
        DateFormatSymbols dfs = new DateFormatSymbols();
        String[] months = dfs.getMonths();
        return months[monthNumber];
    }
}
