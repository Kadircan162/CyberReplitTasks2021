package day33_Constructors.labQuestionsDay35;

public class Employee {
    String name;
    int idNumber;
    String department;
    String position;

    public Employee(String name, int idNumber, String department, String position){
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }

    public Employee(String name, int idNumber){
        this.name = name;
        this.idNumber = idNumber;
        department = "";
        position = "";
    }
    public Employee(){
        name = "";
        idNumber = 0;
        department = "";
        position = "";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }
}
