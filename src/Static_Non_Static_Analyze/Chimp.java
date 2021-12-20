package Static_Non_Static_Analyze;


public class Chimp {

    public static void main(String[] args) {
        Rope.swing();
        new Rope().swing();
        //System.out.println(LENGTH); //gives error since a class can reach a variable or a method of another class only by creating
                                        //an object of that class. If static, then can call by Class name (Rope.LENGTH)

        System.out.println(Rope.LENGTH);

        Rope rope = new Rope();
        System.out.println(rope.LENGTH);
        System.out.println(new Rope().LENGTH);
    }

}
