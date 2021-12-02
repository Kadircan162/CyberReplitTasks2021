package day20Tasks_StringMethods;

public class Task80HasStringInAnotherString {

    public static void main(String[] args){

        String str1 = "Your order confirmation confirmation number is XYZ";
        String str2 = "confirmation";

        if(str1.contains(str2)){
            System.out.println(str1.indexOf(str2));
            System.out.println(str1.lastIndexOf(str2,11));
        }else{
            System.out.println("Not found");
        }
        System.out.println("****************");

        if(str1.lastIndexOf(str2,11)!=-1){
            System.out.println(str1.lastIndexOf(str2,20));
        }else{
            System.out.println("Not found");
        }


    }
}
