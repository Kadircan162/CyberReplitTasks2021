package assignmentOnStringAndMethodsDay29;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q13NavigateOnRoad {
    public static void main(String[] args) {
        String realRoute = "ABCD";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter starting point A, B, C or D");
        String start = input.next().toUpperCase();
        System.out.println("Enter ending point A, B, C or D");
        String end = input.next().toUpperCase();
        printMyRoute(realRoute, start, end);

    }
    public static void printMyRoute(String route, String start, String end){
        String[] navigate = {"right", "down", "left", "up"};
        String routeDummy = route;
        if(start.equals(end) || start.charAt(0) > end.charAt(0)){
            routeDummy = route.concat(route);
        }

        String printRoute = "";
        int index = routeDummy.lastIndexOf(end.charAt(0), end.charAt(0));
        switch (start){
            case "A":
                printRoute = fetchMyRoute(0, index, navigate);
                break;
            case "B":
                printRoute = fetchMyRoute(1, index, navigate);
                break;
            case "C":
                printRoute = fetchMyRoute(2, index, navigate);
                break;
            case "D":
                printRoute = fetchMyRoute(3, index, navigate);
                break;
        }
        printRoute = printRoute.substring(0, printRoute.lastIndexOf('>', '>'));
        System.out.println(printRoute);
    }

    private static String fetchMyRoute(int i, int index, String[] arr){
        String printRoute="";
        for( ; i< index; i++){
            printRoute += arr[i] + " > ";
        }
        return printRoute;
    }
}
