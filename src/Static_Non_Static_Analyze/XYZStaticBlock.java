package Static_Non_Static_Analyze;

public class XYZStaticBlock {

    private static final int THREE=15; //jvm looks initialization on static variable first, if not then it searches for a static block
    public static final int NUM_SECONDS_PER_HOURS;

    static {
        xyz();
        NUM_SECONDS_PER_HOURS=16;
    }

    {
        xyz();
    }

    static {
        TWO = 5;
        //THREE = 15;//second initialization is not allowed even from static block
        FOUR = 20;
    }

    public static void xyz(){

    }

    private static int one;
    private static final int TWO;
    private static final int FOUR;





}
