package control;

import model.ExchangeRate;
import model.Money;
import process.Exchanger;
import ui.ExchangeDialog;
import ui.MoneyDisplay;

public class ExchangeOperation {

    private final ExchangeDialog exchangeDialog;
    private final MoneyDisplay display;
    private final ExchangeRate exchangeRate;
    private final Exchanger exchanger;

    public ExchangeOperation(ExchangeDialog exchangeDialog, MoneyDisplay display, ExchangeRate exchangeRate) {
        this.exchangeDialog = exchangeDialog;
        this.display = display;
        this.exchangeRate = exchangeRate;
        exchanger = new Exchanger();
    }

    public void execute() {
        Money money = exchanger.exchange(exchangeDialog.getExchange().getMoney(), exchangeRate);
        display.display(money);
    }
}
