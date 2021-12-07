package day38Overriding;

public class Employee {
    int hourlyPay = 10;
    double totalPay;
    static boolean  isEnough = false;


    public double calculateDailyPay(int dailyWorkHour){
        System.out.println(isEnough);
        totalPay = hourlyPay * dailyWorkHour;
        return totalPay;
    }

    public FullTimeEmployee workerType(){
        return new FullTimeEmployee();
    }

    public Employee workerType(Contractor ct){
        return new Contractor();
    }

    public Contractor workerType(Contractor ct, FullTimeEmployee ft){
        return new Contractor();
    }
}
