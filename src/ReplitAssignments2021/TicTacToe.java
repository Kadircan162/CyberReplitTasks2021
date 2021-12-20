package ReplitAssignments2021;

public class TicTacToe {
    public static void main(String[] args) {
        char[] x = {
                'X', 'X', 'X',
                '-', 'X', '-',
                '-', '0', '-'
        };


        System.out.println("won(x) = " + won(x));

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
