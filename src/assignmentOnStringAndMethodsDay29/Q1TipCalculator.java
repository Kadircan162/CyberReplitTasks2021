package assignmentOnStringAndMethodsDay29;

import java.util.Scanner;

public class Q1TipCalculator {
    private static boolean isSplit;
    private static int numberOfPeople;
    private static double checkAmount;
    private static String serviceQuality;

    public void setInfo(){
        Scanner input = new Scanner(System.in);
        System.out.println("If split enter Yes(Y, y), if non-split enter No(N, n)");
        String split = input.nextLine();
        if(split.substring(0,1).equalsIgnoreCase("y")){
            isSplit = true;
        }else{
            isSplit = false;
        }
        System.out.println("Please enter number of people served");
        numberOfPeople = input.nextInt();
        System.out.println("Please enter check amount");
        checkAmount = input.nextDouble();
        input.nextLine();
        System.out.println("Value the service quality as following: Poor(P,p), Fair(F,f), Good(G,g), Great(Gr, gr), Excellent(E,e)");
        serviceQuality = input.next();
        input.nextLine();
    }

    public static void tipCalculator(boolean isSplit, int numberPeople, double checkAmount, String serviceQuality){

        double tipAmount = 0.0;
        double totalToPay;
        System.out.print("Number of people entered: ");
        for(int i=0; i<numberPeople; i++){
            System.out.print("&");
        }
        System.out.println();

        switch (serviceQuality.toLowerCase()){
            case "poor":
                tipAmount = checkAmount * 0.05;
                break;
            case "fair":
                tipAmount = checkAmount * 0.1;
                break;
            case "good":
                tipAmount = checkAmount * 0.15;
                break;
            case "great":
                tipAmount = checkAmount * 0.2;
                break;
            case "excellent":
                tipAmount = checkAmount * 0.25;
                break;
            default:
                tipAmount = checkAmount * 0.25; //count as excellent
                break;
        }

        totalToPay = checkAmount + tipAmount;
        System.out.println("Total to pay: " + totalToPay);
        System.out.println("Total tip: " + tipAmount);
        System.out.println("Total per person: " + (totalToPay / numberPeople));
        System.out.println("Tip per person: " + tipAmount / numberPeople);

    }

    public static void main(String[] args) {
        new Q1TipCalculator().setInfo();
        tipCalculator(isSplit, numberOfPeople, checkAmount, serviceQuality);
    }

}
