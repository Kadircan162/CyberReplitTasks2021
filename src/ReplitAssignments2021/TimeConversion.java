package ReplitAssignments2021;

import java.util.Arrays;
import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       // timeConversion(scan.nextLine());
        timeConversion("33:59:59AM");
    }

    public static void timeConversion(String s) { //01:35:32AM

        String[] time = s.split(":", 2); // limit:2 means make array with 2 elements--second ":" skipped
        System.out.println(Arrays.toString(time));

        if(Integer.parseInt(time[0]) > 12 && Integer.parseInt(time[0]) < 24){ //here to disregard given time with above 12 hours
            System.out.println(s.replaceAll("[a-zA-Z]", ""));
            return;
        }
        if(Integer.parseInt(time[0]) >= 24){
            time[0] = "0" + (Integer.parseInt(time[0])-24);
            System.out.println(time[0] + ":" + time[1].replaceAll("[a-zA-Z]", ""));
            return;
        }

        if(time[1].replaceAll("[^a-zA-Z]", "").equalsIgnoreCase("AM")){
           if(Integer.parseInt(time[0]) == 12){ //midnight
               time[0] = "00";
               System.out.println(time[0] + ":" + time[1].replaceAll("[amAM]", ""));
           }else{
               System.out.println((time[0] + ":" + time[1].replaceAll("[amAM]", "")));
           }
           return;
        }
        if(Integer.parseInt(time[0]) == 12){ // PM
            System.out.println(time[0] + ":" + time[1].replaceAll("[pmPM]", ""));
        }else{
            time[0] = "" + (Integer.parseInt(time[0]) + 12);
            System.out.println(time[0] + ":" + time[1].replaceAll("[pmPM]", ""));
        }
    }
}
