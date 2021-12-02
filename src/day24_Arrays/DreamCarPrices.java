package day24_Arrays;

import java.util.Random;
import java.util.Scanner;

public class DreamCarPrices {
    public static void carModels(){
        String[] cars = {"Honda","Toyota","Nissan","BMW","Mercedes","Porche","Ferrari"};
        int i = 0;
        for(String carNames : cars){
            System.out.println((i+1) + ". " + carNames);
            i++;
        }
    }
    public static void carPrices(int carIndex){
        String[] cars = {"Honda","Toyota","Nissan","BMW","Mercedes","Porche","Ferrari"};
        for(int i=0; i<cars.length; i++){
            System.out.println((i+1) + ". " + cars[i]);
        }
        float carPrice = 0.0F;
        Random rd = new Random();
        if(carIndex <= 0){
            noSuchCarModel();
        }else if(carIndex == 1 || carIndex == 2 || carIndex == 3){
            carPrice = 20_000 + (40_000-20_000)*rd.nextFloat();
            System.out.println("========================================");
            System.out.println(" Your dream car " + cars[carIndex-1] + " is " + carPrice + " EUR");
            System.out.println("========================================");
        }else if(carIndex == 4 || carIndex == 5){
            carPrice = 50_000 + (80_000-50_000)*rd.nextFloat();
            System.out.println("========================================");
            System.out.println(" Your dream car " + cars[carIndex-1] + " is " + carPrice + " EUR");
            System.out.println("========================================");
        }else if(carIndex == 6 || carIndex == 7){
            carPrice = 100_000 + (150_000-100_000)*rd.nextFloat();
            System.out.println("========================================");
            System.out.println(" Your dream car " + cars[carIndex-1] + " is " + carPrice + " EUR");
            System.out.println("========================================");
        }
    }

    public static void noSuchCarModel(){
        System.out.println("No such car model..");
    }

    public static void main(String[] args) {
        carModels();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your dream number to see its price: ");
        carPrices(sc.nextInt());
    }
}
