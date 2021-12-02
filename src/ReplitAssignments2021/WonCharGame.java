package ReplitAssignments2021;

import java.util.Scanner;

public class WonCharGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char [] game = {'-','o','x','-', 'o', 'x','-', '-', 'o'};
//        for(int i=0; i < game.length; i++) {
//            game[i] = in.next().charAt(0);
//        }

        System.out.println(won(game));
    }



    public static String won(char[] x){

        String winner = "";

        int max = Integer.MIN_VALUE;
        for(int i=0; i<x.length; i++){
            String player = "";
            for(int j=i; j<x.length; j++){
                if(x[i] == x[j]){
                    player += ""+x[j];
                }
            }
            if(player.length() > max){
                max = player.length();
                winner = ""+x[i];
            }

        }
        return "Player " + winner.charAt(0) + " won";
    }
}
