package day37Inheritance;

public class SuperClass2 {

    int number;
    String name;
    static boolean canCall;

    public SuperClass2(){

    }

    public SuperClass2(int x){
        System.out.println("SuperClass2");
    }

    public void i_M_Super(){
        System.out.println("i_M_Super");
    }
    public static void i_M_SuperToo(){
        System.out.println("i_M_SuperToo but static");
    }

}
