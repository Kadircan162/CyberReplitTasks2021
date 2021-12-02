package Static_Non_Static_Analyze;

public class StaticBlock {

    static final int NUM_SEC_PER_HOUR;

    static {
        NUM_SEC_PER_HOUR = 8;
    }

    static {
       // NUM_SEC_PER_HOUR = 9; error
    }
}
