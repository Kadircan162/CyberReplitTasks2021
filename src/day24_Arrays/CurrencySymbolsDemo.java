package day24_Arrays;

import java.util.Currency;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class CurrencySymbolsDemo {
    public static void main(String[] args) {
        CurrencySymbolsDemo cs = new CurrencySymbolsDemo();

        Map<String, String> currencies = cs.getAvailableCurrencies();
        for (String country : currencies.keySet()) {
            String currencyCode = currencies.get(country);
            System.out.println(country + " => " + currencyCode);
        }
    }

    /**
     * Get the currencies code from the available locales information.
     *
     * @return a map of currencies code.
     */
    private Map<String, String> getAvailableCurrencies() {
        Locale[] locales = Locale.getAvailableLocales();

        // We use TreeMap so that the order of the data in the map sorted
        // based on the country name.
        Map<String, String> currencies = new TreeMap<>();
        for (Locale locale : locales) {
            try {
                currencies.put(locale.getDisplayCountry(),
                        Currency.getInstance(locale).getCurrencyCode());
            } catch (Exception e) {
                // when the locale is not supported
            }
        }
        return currencies;
    }
}
