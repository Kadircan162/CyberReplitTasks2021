package day40_accessmodifiers_final;

public class Test {
    public static void main(String[] args) {
        String a = new String("Apple");

        String b = a;

        b= "Orange";


        if(a == b){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        if(a.equals(b)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
