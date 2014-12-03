package control;

import ui.ExchangeDialog;
import ui.MoneyDisplay;

public class ExchangeOperation {

    private final ExchangeDialog exchangeDialog;
    private final MoneyDisplay display;

    public ExchangeOperation(ExchangeDialog exchangeDialog, MoneyDisplay display) {
        this.exchangeDialog = exchangeDialog;
        this.display = display;
        
    }


    public void execute() {
        display.display(null); // ?????
    }
}
