package ReplitAssignments2021;

import java.util.Scanner;

public class CurrencyConversion {

    public static double convertC(String[][] money,String[][] convertionRate) {
        // write your code here
        double sum = 0;
        for(int i=0; i<money.length; i++){
            if(money[i][0].equalsIgnoreCase(convertionRate[i][0])){
                sum += Double.parseDouble(money[i][1]) * Double.parseDouble(convertionRate[i][1]);
            }else if(money[i][0].equalsIgnoreCase(convertionRate[i+1][0])){
                sum += Double.parseDouble(money[i][1]) * Double.parseDouble(convertionRate[i][1]);
            }
        }
        return sum;

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println();

        String[][] test_money =
                {
                        {"yen","5.0"},
                        {"frank","5.0"},
                };

        String[][] test_convert=
                {
                        {"yen","1"},
                        {"frank","1"},
                };

        double res = convertC(test_money,test_convert);
        System.out.print(res);

    }
}
