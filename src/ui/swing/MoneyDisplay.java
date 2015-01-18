package ui.swing;

import java.text.DecimalFormat;
import model.Money;

public class MoneyDisplay implements ui.MoneyDisplay {

    private final MoneyCalculatorFrame frame;
    private final DecimalFormat df = new DecimalFormat("0.00");

    public MoneyDisplay(MoneyCalculatorFrame frame) {
        this.frame = frame;
    }

    @Override
    public void display(Money money) {
        frame.getArea().getArea().setText("El cambio es " + df.format(money.getAmount()) + " " + money.getCurrency() + "\n");
    }

}
