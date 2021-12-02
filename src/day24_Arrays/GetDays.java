package day24_Arrays;

import java.text.DateFormatSymbols;

public class GetDays {
    public static void main(String[] args) {
        System.out.println(getWeekdays(2));

        String[] days = new String[7];

        DateFormatSymbols dfs = new DateFormatSymbols();
        days = dfs.getWeekdays();

        for(int i=0; i<days.length; i++){
            System.out.print(days[i]);
        }
    }
    public static String getWeekdays(int dayNumber){
        String[] days = new String[7];
        DateFormatSymbols dfs = new DateFormatSymbols();
        days = dfs.getWeekdays();
        return days[dayNumber];
    }

}
