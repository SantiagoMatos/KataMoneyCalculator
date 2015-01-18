package app;

import console.CurrencyDisplay;
import control.ExchangeOperation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Currency;
import model.CurrencySet;
import model.ExchangeRate;
import persistance.mock.CurrencySetLoader;
import ui.swing.MoneyCalculatorFrame;
import ui.swing.MoneyDisplay;

public class Application {

    public static void main(String[] args) {
        CurrencySet currencySet = new CurrencySetLoader().load();
        final MoneyCalculatorFrame frame = new MoneyCalculatorFrame(currencySet.toArray());
        final CurrencyDisplay display = new CurrencyDisplay();
        frame.registerActionInCalculateButton(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Currency in = frame.getExchangeDialog().getMoney().getCurrency();
                Currency out = frame.getExchangeDialog().getExchange().getCurrency();
                ExchangeRate exchangeRate = new ExchangeRate(in, out, 1.3);
                ExchangeOperation operation = new ExchangeOperation(frame.getExchangeDialog(), new MoneyDisplay(frame), exchangeRate);
                operation.execute();
            }
        }
        );
    }

}
