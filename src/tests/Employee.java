package tests;

public class Employee {
    private String name;
    private String jobTitle;
    private int id;
    private double salary;

    public static String companyName = "Microsoft";
    public String location = "USA";

    public Employee(){
        this("Mike");
    }

    public Employee(String name){
        this(name, "tester");
    }

    public Employee(String name, String jobTitle){
        this(name, jobTitle, 546234);
    }

    public Employee(String name, String jobTitle, int id){
        this(name, jobTitle, id, 5000.0);
    }

    public Employee(String name, String jobTitle, int id, double salary){
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.id = id;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }


}
