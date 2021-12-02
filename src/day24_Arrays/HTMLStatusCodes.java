package day24_Arrays;

import java.util.Arrays;

public class HTMLStatusCodes {
    public static void main(String[] args) {
//        int[] statusCodes = {200, 201, 204, 400, 401, 403, 404, 500};
//        String[] response = {"OK", "Created", "No Content", "Bad Request", "Unauthorized", "Forbidden",
//                            "Not Found", "Internal Server Error"};
//        int i=0;
//        for(int codes : statusCodes){
//            System.out.println(codes + " " + response[i]);
//            i++;
//        }
        responseConverter(401);
    }

    public static void responseConverter(int codes){
        int[] statusCodes = {200, 201, 204, 400, 401, 403, 404, 500};
        String[] response = {"OK", "Created", "No Content", "Bad Request", "Unauthorized", "Forbidden",
                "Not Found", "Internal Server Error"};
            int i=0;
            for(int co : statusCodes){
                if(co == codes){
                    System.out.println(codes + " " + response[i]);
                    break;
                }
                i++;
            }
        System.out.println("*************second way*******************");
        int num = Arrays.binarySearch(statusCodes, codes);
        System.out.println(codes + " " + response[i]);
    }
}
