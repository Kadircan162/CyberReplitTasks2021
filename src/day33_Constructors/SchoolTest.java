package day33_Constructors;

public class SchoolTest {
    public static void main(String[] args) {
        School school = new School("Elementary", 15);
        System.out.println(school.s);
        System.out.println(school.a);
        school.get("University", 10);
    }
}
