package day37Inheritance;

public class SubClass2 extends SuperClass2{

    public SubClass2(){

        System.out.println(number);
        //super(5);

        System.out.println("SubClass2 no arg");

    }

    public SubClass2(int x){
        System.out.println("SubClass2 with arg");
    }

    public static void callSuper(){
        SuperClass2 superClass2 = new SuperClass2();
        System.out.println(superClass2.name);
        System.out.println(superClass2.number);
        System.out.println(canCall);
        System.out.println(SuperClass2.canCall);
//        System.out.println(number);//error
//        System.out.println(name);//error

    }

    public void callSuper2(){
        System.out.println(name);
        System.out.println(number);
        System.out.println(canCall);

        SuperClass2 superClass2 = new SuperClass2();
        System.out.println(superClass2.canCall);
        System.out.println(SuperClass2.canCall);
    }

    public void i_M_Super(){
        System.out.println("i_M_SuperSubclass at subclass");
    }

    public static void i_M_SuperToo(){
        System.out.println("i_M_SuperToo but static at subclass");
    }
}
