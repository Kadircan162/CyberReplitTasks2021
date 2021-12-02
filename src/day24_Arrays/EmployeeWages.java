package day24_Arrays;

public class EmployeeWages {
    public static void weeklyWage(String[] employeesWithNumberOfHoursPerDay, int paymentPerHour){
        int[] onlyHours = new int[employeesWithNumberOfHoursPerDay.length];
        String[] weeklyWagesPerEmployees = new String[employeesWithNumberOfHoursPerDay.length];
        for(int i=0; i<employeesWithNumberOfHoursPerDay.length; i++){
            onlyHours[i] = Integer.parseInt(employeesWithNumberOfHoursPerDay[i].replaceAll("[^0-9]", ""));
            System.out.println("Total (gross pay) of " + employeesWithNumberOfHoursPerDay[i] + " = " + (onlyHours[i]*7*paymentPerHour)
             + "$");
        }
    }

    public static String[] getEmployeesWithWorkHours(){
        String[] employees = {"John", "Micheal", "Erik", "Mehmet", "Volkan"};
        int[] numberOfHoursPerDayPerEmployee = {1, 7, 3, 10, 9};
        String[] employeesWithWorkHours = new String[employees.length];
        for(int i=0; i<employees.length; i++){
            employeesWithWorkHours[i] = employees[i] + " (" + numberOfHoursPerDayPerEmployee[i] + " work hours)";
            System.out.print(employeesWithWorkHours[i] + " ");
        }
        System.out.println();
        System.out.println("===========================================================================================================");
        return employeesWithWorkHours;
    }

    public static void main(String[] args) {
        weeklyWage(getEmployeesWithWorkHours(), 10);
    }
}
