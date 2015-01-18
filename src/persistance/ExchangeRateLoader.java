package persistance;

import model.Currency;
import model.ExchangeRate;

public class ExchangeRateLoader {
    public ExchangeRate load (Currency from, Currency to){
        return new ExchangeRate(new Currency("Euro", "EUR", "E"), new Currency("Dollar", "USD", "$"), 1.3);
    }
}
