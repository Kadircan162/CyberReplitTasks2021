package day24_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Currency;
import java.util.List;

public class ArrayLoopWithConditions {
    public static void main(String[] args) {
        Currency cur = Currency.getInstance("USD");
        String symbol = cur.getSymbol();
        double[] prices = {22.9, 12.4, 43.12, 65.0, 150.9, 100.87, 90.5, 124.9, 234.56};
        Arrays.sort(prices);
        for (double each : prices){
            if(each>40 && each<150){
                System.out.println(symbol + each);
            }

        }

    }
}
