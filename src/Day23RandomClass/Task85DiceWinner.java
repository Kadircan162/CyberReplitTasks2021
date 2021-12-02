package Day23RandomClass;

import java.util.Random;
import java.util.Scanner;

public class Task85DiceWinner {
    public static void main(String[] args) {
        String result = Rolls(10);
        int computerWins = Integer.parseInt(result.substring(0,result.indexOf(" ")));
        int userWins = Integer.parseInt(result.substring(result.indexOf(" ")+1));
        if(computerWins>userWins){
            System.out.println("Computer is the winner..");
        }else if(computerWins<userWins){
            System.out.println("Congratulations! You are the WINNER!!");
        }else{
            System.out.println("No winner..try next time..");
        }
    }

    public static String Rolls(int timesOfRolls){
        Scanner sc = new Scanner(System.in);
        int counterComputer=0, counterUser=0;
        int i=0;
        do{
            int computerRoll = RandomDice();
            System.out.println("Computer rolls: " + computerRoll);
            System.out.print("Please push enter to roll the dices..");
            sc.nextLine();
            int userRoll = RandomDice();
            System.out.println("You roll: " + userRoll);
            if(computerRoll>userRoll){
                System.out.println("Computer win :((");
                counterComputer+=1;
            }else if(computerRoll<userRoll){
                System.out.println("You win :))");
                counterUser+=1;
            }else{
                System.out.println("No winner..");
            }
            System.out.println("-----------------------------");
            i++;
        }while (i<timesOfRolls);
        System.out.println("User: " + counterUser + "\n" + "Computer: " + counterComputer);
        return counterComputer + " " + counterUser;

    }
    public static int RandomDice(){
        Random dice = new Random();
        System.out.println("Rolling dices..");
        return dice.nextInt(6)+1;
    }
}
