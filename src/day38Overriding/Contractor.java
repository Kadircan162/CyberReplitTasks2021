package day38Overriding;

public class Contractor extends Employee{

    @Override
    public double calculateDailyPay(int dailyWorkHour) {
        totalPay = (hourlyPay * dailyWorkHour * 1.05) + 200;
        System.out.println(super.hourlyPay);
        super.calculateDailyPay(5);
        calculateDailyPay(10);
        calculateDailyPay(19);
        return totalPay;
    }


}
