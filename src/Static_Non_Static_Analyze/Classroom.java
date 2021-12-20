package Static_Non_Static_Analyze;

public class Classroom extends School{

    private int roomNumber;
    String teacherName;
    static int globalKey = 54321;
    public int floor = 3;

    public Classroom(int r, String t){
        roomNumber = r; teacherName = t;
    }

    public static void swing(){
        int x;
    }

    @Override
    public void move() {

    }
}

