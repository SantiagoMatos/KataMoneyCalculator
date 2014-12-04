package persistance.mock;

import model.Currency;
import model.CurrencySet;

public class CurrencySetLoader implements persistance.CurrencySetLoader {

    @Override
    public CurrencySet load() {
        CurrencySet currencySet = new CurrencySet();
        currencySet.add(new Currency("Euro", "EUR", "E"));
        currencySet.add(new Currency("Dollar", "USD", "$"));
        currencySet.add(new Currency("Pound", "GBP", "L"));
        return currencySet;
    }

}
