package day24_Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FindCarsOutOfRandomCars {
    public static String[] setCars(){
        String[] carData = {"Honda", "Toyota", "Porche", "Mercedes", "BMW", "Opel", "Chevrole", "Citroen", "Renault", "Nissan", "Ford"};
        String[] carsInGaleria = new String[carData.length-6]; // car array that is to be checked for matching with the given car name
        Random rnd = new Random();

        for(int i=0; i< carsInGaleria.length; i++){ // here cars in galeria (real existing) is created
            int rndNumber = rnd.nextInt(carData.length); //random numbers from 0 to 10 (excluded)
            carsInGaleria[i] = carData[rndNumber]; //choose one of the cars randomly
            carData[rndNumber] = null; //the car chosen from carData array gets null not be chosen again
            String[] newCarData = new String[carData.length-1]; //here a new array is created for carData not to choose null in it
            int k=0; // this will be index goes with the newCarData array
                for (int j=0; j<carData.length; j++){ // here newCarData is created in place of carData without null elements
                    if(carData[j] != null){
                        newCarData[k] = carData[j];
                        k++;
                    }
                }
                carData = newCarData; // address of carData is changed to newCarData with no null elements
        }
        return carsInGaleria;
    }
    public static boolean findCar(String carModel){
        String[] carDummyArray = setCars();
        for(int i=0; i<carDummyArray.length; i++){
            if(carDummyArray[i].equalsIgnoreCase(carModel)){
               carDummyArray[i] = "[".concat(carDummyArray[i]).concat("]"); //to distinguish the car searched
               String printCars = "";
               for(int j=0; j<carDummyArray.length; j++){ //to print out the cars in galeria with the bracketed searched one
                   printCars += carDummyArray[j] + " ";
               }
               System.out.println(printCars);
               return true; // here the findCar() method ends
            }else if(i == carDummyArray.length-1){ // that means it reached to the end of the number of cars in galeria
                System.out.println(Arrays.toString(carDummyArray));
                return false; //here the findCar() method ends
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arraySize = 3;
        System.out.println(findCar("Ford"));
    }
}
