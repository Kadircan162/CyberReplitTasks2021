package day38Overriding;

public class FullTimeEmployee extends Employee{
    Employee employee = new Employee();
    boolean b;
    static int x;
    public int y;
    public static int z;
    @Override
    public double calculateDailyPay(int dailyHour){
        Employee employee = new Employee();
        totalPay = hourlyPay * dailyHour * 1.05;
        System.out.println(hourlyPay);
        System.out.println(isEnough);
        return totalPay;
    }

    public void test(){
       //public int x; // error: public access modifier as declaration cannot be used in methods
       int y;
    }

    public static void test2(){
        // static int x; //error: static key word as declaration cannot be used in a method.
    }

    @Override
    public FullTimeEmployee workerType() {

        return new FullTimeEmployee();
    }

    @Override
    public Employee workerType(Contractor ct) {
        return new Employee();
    }
    @Override
    public Contractor workerType(Contractor ct, FullTimeEmployee ft) {
        return new Contractor();
    }

    public void useSuperKeyword(){
        Employee em = new Employee();
        System.out.println(super.hourlyPay);
        System.out.println(super.isEnough);
        System.out.println(isEnough);
    }

    public void setSuperStaticVariable(boolean isEnough){
        System.out.println(super.isEnough);
        super.isEnough = isEnough;
        System.out.println(super.isEnough);
    }
}
