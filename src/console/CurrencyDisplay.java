package console;

import model.Exchange;

public class CurrencyDisplay implements ui.CurrencyDisplay {

    @Override
    public void getCurrencyFrom(Exchange exchange) {
        System.out.println(" lo quiero pasar a " + exchange.getCurrency());
    }

}
