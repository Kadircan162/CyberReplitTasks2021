package day38Overriding;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee em = new Employee();
        FullTimeEmployee ft = new FullTimeEmployee();
        Contractor ct = new Contractor();

        System.out.println(em.calculateDailyPay(16));
        System.out.println(ft.calculateDailyPay(16));
        System.out.println(ct.calculateDailyPay(16));
    }
}
