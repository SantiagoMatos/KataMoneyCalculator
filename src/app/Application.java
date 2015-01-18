package app;

import console.CurrencyDisplay;
import console.MoneyDisplay;
import control.ExchangeOperation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.CurrencySet;
import model.ExchangeRate;
import persistance.mock.CurrencySetLoader;
import ui.swing.MoneyCalculatorFrame;

public class Application {

    public static void main(String[] args) {
        CurrencySet currencySet = new CurrencySetLoader().load();
        final MoneyCalculatorFrame frame = new MoneyCalculatorFrame(currencySet.toArray());
        final CurrencyDisplay display = new CurrencyDisplay();
        frame.registerActionInCalculateButton(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ExchangeRate exchangeRate = new ExchangeRate(frame.getExchangeDialog().getMoney().getCurrency(),
                        frame.getExchangeDialog().getExchange().getCurrency(), 1.3);
                ExchangeOperation operation = new ExchangeOperation(frame.getExchangeDialog(), new MoneyDisplay(), exchangeRate);
            }
        }
        );
    }

}
