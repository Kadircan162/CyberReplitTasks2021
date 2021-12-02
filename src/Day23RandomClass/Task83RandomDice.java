package Day23RandomClass;

import java.util.Random;
import java.util.Scanner;

public class Task83RandomDice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        do{
            RadomDice();
            System.out.print("Roll them again (y=yes)? ");
        }while (sc.next().equalsIgnoreCase("y"));

    }
    public static void RadomDice(){
        Random dice = new Random();
        System.out.println("Rolling dices..");
        System.out.println("Their values are: " + (dice.nextInt(6)+1) + " " + (dice.nextInt(6)+1));
    }
}
