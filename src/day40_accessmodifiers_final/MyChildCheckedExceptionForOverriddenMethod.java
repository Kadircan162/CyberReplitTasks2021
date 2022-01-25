package day40_accessmodifiers_final;

import java.io.FileNotFoundException;

public class MyChildCheckedExceptionForOverriddenMethod extends MyParent_CheckedExceptionForOverriddenMethod {

    void method1() throws FileNotFoundException {} //Here IOException is not allowed for the overridden method as child method cannot
                                                    //throw more broad (checked) exception than the parent's method does. So, here we can
                                                    //throw maximum of FileNotFoundException or less one (no exception also welcome)
}
