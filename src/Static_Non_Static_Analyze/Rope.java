package Static_Non_Static_Analyze;

public class Rope {

    public static int LENGTH;

    static {
        LENGTH = 10;
    }

    public static void swing() {
        System.out.print("swing ");
    }

    public static void main(String[] args) {
        System.out.println(LENGTH);
    }

}


