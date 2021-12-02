package day33_Constructors;

public class Student2 {
    int age;
    boolean right;
    int a;
    int b;
    public Student2(int age, int score){
        this(5);
        System.out.println(age * score);
    }
    public Student2(int age){
        //this();
        System.out.println(age);
    }

    public Student2(boolean right, int a, int b){
        right = right;
        a=a; // if 'this.' isn't used here, compiler consider both 'a' come from argument (user)
        b=b;
        System.out.println(right);
        System.out.println(a);
        System.out.println(b);
    }

}
