package day33_Constructors;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Mike", 17, 'M', 2016,"Java");
        Student student2 = new Student("Smith", 18, 'M', 2015,"JS", "Istanbul");
        Student student3 = new Student("Mary", 19, 'F', 2017,"TS", "Harward");
        Student student4 = new Student("Kadircan", 31, 'M', 2002);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        StudentImpl simp = new StudentImpl("Hasan", 31, 'M', 2020, "JAVA", "Marmara");
        System.out.println(simp.name);
        System.out.println(simp.age);
        System.out.println(simp.gender);
        System.out.println(simp.year);
        System.out.println(simp.course);
        System.out.println(simp.university);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");


        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gender);
        System.out.println(student1.year);
        System.out.println(student1.course);
        System.out.println(student1.university);
        System.out.println();

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gender);
        System.out.println(student2.year);
        System.out.println(student2.course);
        System.out.println(student2.university);
        System.out.println();

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gender);
        System.out.println(student3.year);
        System.out.println(student3.course);
        System.out.println(student3.university);

        System.out.println(student4.name);
        System.out.println(student4.age);
        System.out.println(student4.gender);
        System.out.println(student4.year);
        System.out.println(student4.course);
        System.out.println(student4.university);

        student4.StudentNotes();
        student4.StudentHealth();




        System.out.println("*************");
        System.out.println(student1.gender);
        System.out.println(student1.gender);
        System.out.println(student1.age);

        System.out.println("***************************");
        StudentTest stest = new StudentTest(); // own class's object to reach non-static test1() and test2() methods
        stest.test1();
        stest.test2();


        //StudentTest.test1();
        //StudentTest.test2();




    }
    public void test1(){
        double d1 = 9.0;
        System.out.println(d1);
        System.out.println("-------------------------------");
        Student s1 = new Student("Mike", 17, 'M', 2016,"Java", "Cybertek");
        System.out.println(s1.gender);
        System.out.println(s1.gender);
        System.out.println("-------------------------------");

    }
    public void test2(){
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&6");
        Student s2 = new Student("Mike", 17, 'F', 2016,"Java", "Cybertek");
        System.out.println(s2.gender);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&6");
    }
}
