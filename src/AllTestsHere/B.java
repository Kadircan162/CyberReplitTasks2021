package AllTestsHere;

public class B {



    public static void main(String[] args) {
        A a = new A();

        //System.out.println("A.x = " + A.x);//error
        //System.out.println("a.x = " + a.x);//error

        System.out.println("a.name = " + a.name);
        System.out.println("a.x = " + A.name);


        System.out.println("a.d = " + a.d);
        System.out.println("A.d = " + A.d);

    }
}
