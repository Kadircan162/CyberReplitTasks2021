package Static_Non_Static_Analyze;

public class Test {

    public static final boolean IS;//a static variable can be initialized both from its statement or from a static block

    static {
        IS = false;
    }
    public static void main(String[] args) {
        int x, y, z;


    }
    public static void m1(){
        int x=0;

        for(int i=0; i<5; i++){
           x++;
        }
    }
}
