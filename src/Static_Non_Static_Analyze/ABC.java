package Static_Non_Static_Analyze;

public class ABC {
    static int x;
    private ABC(){

    }

    public static void m1(){

    }

    public void test(){
        Test.m1();
        Test t = new Test();
        t.m1();
    }

}
