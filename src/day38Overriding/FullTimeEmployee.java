package day38Overriding;

public class FullTimeEmployee extends Employee{
    boolean b;
    @Override
    public double calculateDailyPay(int dailyHour){
        totalPay = hourlyPay * dailyHour * 1.05;

        return totalPay;
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
