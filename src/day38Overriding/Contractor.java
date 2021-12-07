package day38Overriding;

public class Contractor extends Employee{

    @Override
    public double calculateDailyPay(int dailyWorkHour) {
        totalPay = (hourlyPay * dailyWorkHour * 1.05) + 200;
        return totalPay;
    }
}
