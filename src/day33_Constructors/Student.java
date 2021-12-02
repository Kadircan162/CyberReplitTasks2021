package day33_Constructors;

public class Student {
    String name;
    int age;
    char gender;
    int year;
    String course = "SDET";
    String university = "Cybertek";

    public Student(String name, int age, char gender, int year, String course) {

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.year = year;
        this.course = course;
        this.university = university;
    }
    public Student(String name, int age, char gender, int year, String course, String university) {

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.year = year;
        this.course = course;
        this.university = university;
    }

    public Student(String name, int age, char gender, int year) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.year = year;
    }

    public void StudentNotes(){
        System.out.println("My notes are So High");
    }
    public void StudentHealth(){
        System.out.println("I'm Great");
    }

}
