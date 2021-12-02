package day33_Constructors.labQuestionsDay35;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("Mike Smith");
        e1.setIdNumber(47899);
        e1.setDepartment("Accounting");
        e1.setPosition("VP");

        Employee e2 = new Employee("Mark Jones", 39119);
        e2.setDepartment("IT");
        e2.setPosition("Developer");

        Employee e3 = new Employee("Ted Britt",81774,"Sales","Sales Person");

        System.out.println("Name:\t\t\tID Number:\t\tDepartment:\t\t\tPosition:");
        System.out.println("\n" + e1.getName() + "\t\t" + e1.getIdNumber() + "\t\t\t" + e1.getDepartment() + "\t\t\t" + e1.getPosition());
        System.out.println(e2.getName() + "\t\t" + e2.getIdNumber() + "\t\t\t" + e2.getDepartment() + "\t\t\t\t\t" + e2.getPosition());
        System.out.println(e3.getName() + "\t\t" + e3.getIdNumber() + "\t\t\t" + e3.getDepartment() + "\t\t\t\t" + e3.getPosition());

    }
}
