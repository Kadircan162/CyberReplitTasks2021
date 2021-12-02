package day33_Constructors.labQuestionsDay35;

import java.util.Scanner;

public class RoulettePocketTest {
    public static void main(String[] args) {
        RoulettePocket r1 = new RoulettePocket();
        Scanner scan = new Scanner(System.in);
        boolean flag = true;

        while (flag){
            System.out.print("Enter a pocket number and get its color: ");

            System.out.println(r1.getPocketColor(scan.nextInt()));
            System.out.print("Play again? Y / N ");

            if(scan.next().equalsIgnoreCase("N")){
                flag = false;
            }
        }
        System.out.println("Roulette game ended..");

    }
}
