package day42_interface;

public interface ITestable2 {

    boolean IS_TEST_PASS = false;

    public void charge1();
    void charge2();
    public abstract void charge3();
    abstract void charge11();
    public default void charging(){} //if two interfaces have the same methods with body and if a class is implementing both of the interfaces,
                                    //the class has to override the method in the interface which comes first on implementing declaration order (here it's to be
                                    //overridden from ITestable since it is the first one on the implementing declaration. The purpose is to clarify which methods it is
                                    //wanted to be overridden.

    public static void met1(){}

}
