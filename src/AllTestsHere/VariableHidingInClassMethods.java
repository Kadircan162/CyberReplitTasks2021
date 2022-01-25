package AllTestsHere;

public class VariableHidingInClassMethods {

    int x = 20;
    static String s = "Apple";

    public void test1(){
        int x = 10;
        System.out.println("x = " + x);
    }

    public void test2(){
        System.out.println("x = " + x);
    }

    public void test3(){
        String s = "Orange";
        System.out.println("s = " + s);
    }

    public void test4(){
        System.out.println("s = " + s);
    }

}

class Test{

    public static void main(String[] args) {
        VariableHidingInClassMethods v = new VariableHidingInClassMethods();

        v.test1();
        v.test2();
        v.test3();
        v.test4();
    }



}
