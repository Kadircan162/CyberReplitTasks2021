package Static_Non_Static_Analyze;

public class StaticEx {

    static int a;
    int b;

    public static void Car(){
        StaticEx sx3 = new StaticEx();
        System.out.println(sx3.b);
        System.out.println(a);
    }

    public void Car2(){
        Car();
        Car3();
        StaticEx sx2 = new StaticEx();
        sx2.Car();
        System.out.println(sx2.b);
        System.out.println(a);
        System.out.println(StaticEx.a);
    }

    public void Car3(){

    }

    public static void main(String[] args) {
        StaticEx sx = new StaticEx();
        sx.Car2();
        Car();
    }
}
