package ReplitAssignments2021;

import java.util.Currency;
import java.util.Scanner;

public class CarInsuranceVerification {
    public static void main(String[] args) {
        //DO NOT CHANGE
        double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");
        //WRITE YOUR CODE HERE
        int age=0, yearsOfDrivingExperience=0;
        int zipCode = 0;
        System.out.println("Enter your name");
        name = scan.nextLine();
        System.out.println("Do you have a US driver license?");
        if(scan.nextLine().equalsIgnoreCase("no")){
            System.out.println("Invalid data!");
            System.exit(0);
        }else{
            System.out.println("Enter your zip code");
            zipCode = scan.nextInt();
            if(zipCode == 20910 || zipCode == 20740){
                premium+=60;
            }else if(zipCode == 22102 || zipCode == 22103){
                premium+=30;
            }else{
                premium+=50;
            }
            System.out.println("Is this vehicle Owned, Financed, or Leased?");
            scan.nextLine();
            vehicleOwnership = scan.nextLine();
            if(vehicleOwnership.equalsIgnoreCase("Owned")){
                premium += 10;
            }else{
                premium +=20;
            }
            System.out.println("How is this vehicle primarily used?");
            vehicleUsage = scan.nextLine();
            if(vehicleUsage.equalsIgnoreCase("Business")){
                premium += 50;
            }else if(vehicleUsage.equalsIgnoreCase("Pleasure")){
                premium += 10;
            }else if(vehicleUsage.equalsIgnoreCase("Commute")){
                premium += 20;
                System.out.println("Days Driven To Work And/Or School");
                daysDrivenToWorkOrSchool = scan.nextInt();
                premium += daysDrivenToWorkOrSchool*5;
                System.out.println("Miles Driven To Work And/Or School");
                milesToWorkOrSchool = scan.nextInt();
                premium += milesToWorkOrSchool*1;
            }
            System.out.println("How old are you?");
            age = scan.nextInt();
            if(age < 16){
                System.out.println("Invalid data!");
                System.exit(0);
            }else if(age>=16 && age<18){
                premium = premium*20;
            }else if(age>=18 && age<=21){
                premium = premium*6;
            }else if(age>21 && age<25){
                premium = premium*2;
            }
            System.out.println("How many years you've been driving?");
            yearsOfDrivingExperience = scan.nextInt();
            if(yearsOfDrivingExperience > 0 && age - yearsOfDrivingExperience>= 16){
                premium -= yearsOfDrivingExperience*5;
            }else{
                System.out.println("Invalid data!");
                System.exit(0);
            }
            scan.nextLine();
            System.out.println("Have you had any accidents in the last 5 years?");
            String hadAccident = scan.nextLine();
            if(hadAccident.equalsIgnoreCase("yes")){
                System.out.println("How many?");
                accidentsAmount = scan.nextInt();
                premium += premium*0.2*accidentsAmount;
            }
            //scan.nextLine();
            System.out.println("Have you had continuous insurance for the past 12 months?");
            continuousInsurance = scan.next();
            if(continuousInsurance.equalsIgnoreCase("no")){
                premium = premium*2;
            }
            System.out.println("What is the highest level of education you have completed?");
            scan.nextLine();
            education = scan.nextLine().replace(" ", "").toLowerCase();
            if(education.equals("phd") || education.equals("bachelors") || education.equals("masters")){
                premium -= premium*0.05;
            }else if(education.equals("doctors")){
                premium -= premium*0.1;
            }else if(education.equals("lessthanhighschool")){
                premium += premium*0.05;
            }
            Currency cur = Currency.getInstance("USD");
            String currencySymbol = cur.getSymbol();
            System.out.println(name + ", here's your quote!\nStart Your Policy Today For: " + currencySymbol + premium);
            referenceNumber = name.substring(0,2).concat(Integer.toString(age)).
                    concat(name.substring(name.length()-2)).concat(Integer.toString(zipCode)).concat(education);
            System.out.println("Reference number: " + referenceNumber.toUpperCase());
        }
    }
}
