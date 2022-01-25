package day40_accessmodifiers_final;

//public class FinalClassTest extends FinalClass { //error: cannot inherit the FinalClass as it's final

public class FinalClassTest {

    public static void main(String[] args) {
        FinalClass f = new FinalClass();
        f.x=25;

        String s = new String("Apple");
        s = new String("Orange");
    }




}
