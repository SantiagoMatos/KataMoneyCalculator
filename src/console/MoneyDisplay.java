package console;

import model.Money;

public class MoneyDisplay implements ui.MoneyDisplay {

    public MoneyDisplay() {
    }

    @Override
    public void display(Money money) {
        System.out.println(money);
    }
}
