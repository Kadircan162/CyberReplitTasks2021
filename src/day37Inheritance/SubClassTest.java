package day37Inheritance;

public class SubClassTest {
    public static void main(String[] args) {
        //SubClass subClass = new SubClass();

        SubClass2 subClass2 = new SubClass2();
        System.out.println(subClass2.number);
        System.out.println(subClass2.name);

        System.out.println(subClass2.canCall);
        System.out.println(SuperClass2.canCall);

        SubClass2.callSuper();
        subClass2.callSuper2();
        subClass2.callSuper();

        SubClass2.i_M_SuperToo();
        subClass2.i_M_Super();
        subClass2.i_M_SuperToo();

        subClass2.i_M_Super();
        subClass2.i_M_SuperToo();

    }
}
