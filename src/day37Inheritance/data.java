package day37Inheritance;

public class data {
    
    private static String name;
    
    public static String getName(){
        return name;
    }
}

class Test extends data{
    public static void main(String[] args) {
        data obj = new data();

    }
}
