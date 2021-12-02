package day24_Arrays;

import java.text.DateFormatSymbols;
import java.util.Scanner;

public class RainfallPerMonths {
    public static void setRainfallPerMonth(double[] arrayOfRainfals){
        DateFormatSymbols dfs = new DateFormatSymbols();
        String[] months = dfs.getMonths();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter in the following rainfall for months ahead");
        System.out.println("Mounth                      Rainfall(In inches)");
        System.out.println("========================================");

        for(int i=0; i<arrayOfRainfals.length; i++){
            System.out.print(months[i] + ": ");
            arrayOfRainfals[i] = scanner.nextDouble();
        }
    }
    public static double sumOfAllRain(double[] rainfalls){
        double sum = 0.0;
        for(double dummy : rainfalls){
            sum += dummy;
        }
        return sum;
    }
    public static void averageRainfall(double[] rainfallData, double sum){
        System.out.println("The average rainfall was: " + sum/rainfallData.length + " inches");
    }
    public static void maxMinRain(double[] rainfallData){
        double maxRain = rainfallData[0], minRain = rainfallData[0];
        for(double maxMinFlag : rainfallData){
            if(maxMinFlag > maxRain){
                maxRain = maxMinFlag;
            }else if(maxMinFlag < minRain){
                minRain = maxMinFlag;
            }
        }
        System.out.println("The max rain is: " + maxRain + " inches");
        System.out.println("The min rain is: " + minRain + " inches");
    }

    public static void main(String[] args) {

        double[] rainfallData = new double[12];
        setRainfallPerMonth(rainfallData);
        System.out.println("The sum of all the rain is: " + sumOfAllRain(rainfallData) + " inches");
        averageRainfall(rainfallData, sumOfAllRain(rainfallData));
        maxMinRain(rainfallData);
    }
}
