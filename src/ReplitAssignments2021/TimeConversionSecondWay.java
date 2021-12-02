package ReplitAssignments2021;

import java.util.Scanner;

public class TimeConversionSecondWay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
     //   timeConversion(scan.nextLine());
        timeConversion("24:00:00aM");
    }

    public static void timeConversion(String s) {

        String[] time = s.split(":", 2);
        int hour = Integer.parseInt(time[0]);
        int newHour = hour - ((hour / 12)*12); //downgrade to 12 based time system
        String minSeconds = time[1].replaceAll("[a-zA-Z]", "");
        boolean amOrPm = time[1].replaceAll(minSeconds, "").equalsIgnoreCase("AM");

        if(amOrPm){
            System.out.println("0" + newHour + ":" + minSeconds);
        }else{
            System.out.println((newHour+12) + ":" + minSeconds);
        }
    }
}
