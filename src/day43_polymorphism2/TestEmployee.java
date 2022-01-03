package day43_polymorphism2;

public class TestEmployee {

    public static void main(String[] args) {

        //European european = new HumanBeings(); //error: HumanBeings is an abstract (interface) so that it cannot be instanciated

        Employee employee = new Employee();
        employee.working();
        employee.residing();
        employee.speaking();

        /*
        Employee employee2 = new Engineer();
        employee2.working();
        employee2.residing();
        employee2.speaking();

        Employee employee3 = new TaxiDriver();
        employee3.working();
        employee3.residing();
        employee3.speaking();

        Employee employee4 = new Manager();
        employee4.working();
        employee4.residing();
        employee4.speaking();
        */

        employee = new Engineer();
        employee.working();
        employee.residing();
        employee.speaking();

        employee = new TaxiDriver();
        employee.working();
        employee.residing();
        employee.speaking();

        employee = new Manager();
        employee.working();
        employee.residing();
        employee.speaking();

    }
}
