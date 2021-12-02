package day20Tasks_StringMethods;

public class Task81StringReplaceAllManupulation {

    public static void main (String[] args){

        String searchResult = "About 3,370,000,000 results (0.82 seconds)";

        System.out.println( searchResult.replaceAll("[^0-9]", ""));

        String date = "10/10/2019 14:59:00";
        timeStamp(date);

        String str1 = new String ("Apple");
        String str2 = str1;
        String str5 = new String("Apple");
        System.out.println(str1 == str2);
        System.out.println(str1 == str5);

        String str3 = "Apple";
        String str4 = "Apple";
        System.out.println(str3 == str4);

        str2 = str2.toUpperCase();

        System.out.println("Str1: " + str1);
        System.out.println("Str2: " + str2);
    }

    static void timeStamp(String date){

        System.out.println(date.replaceAll("[^0-9]", ""));
        System.out.println(date.replaceAll("[0-9]", ""));

    }

}
