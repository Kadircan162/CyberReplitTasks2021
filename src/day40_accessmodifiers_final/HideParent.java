package day40_accessmodifiers_final;

public class HideParent {

    public static void m1(){

    }
}

class HideFromHem extends HideParent{


    public static void m1(){

    }

    public void H1() {
        m1();
    }

}
