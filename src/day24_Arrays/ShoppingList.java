package day24_Arrays;

import java.util.Arrays;
import java.util.Currency;
import java.util.spi.CurrencyNameProvider;

public class ShoppingList {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 12 case"};
        double [] prices={99.99,    150.0,     9.99,     179.99,   249.9,      39.99   } ;
        int[] itemIDs = { 12345,     12346,     12347,     12348,   12349,      12350   };

        System.out.println(Arrays.toString(items).contains("Ipad"));
        Currency cur = Currency.getInstance("EUR");
        String symbol = cur.getSymbol();

        for(int i=0; i<items.length; i++){
            if(items[i].equalsIgnoreCase("Jacket")){
                System.out.println(items[i] + " - " + prices[i] + symbol + " - #" + itemIDs[i]);
            }

        }
    }
}
