package ui.swing;

import java.awt.PopupMenu;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.Currency;
import model.Exchange;
import model.Money;

public class ExchangeDialog extends JPanel implements ui.ExchangeDialog {

    private final Currency[] currencies;
    private JTextField amount;
    private JComboBox<Currency> fromCurrency;
    private JComboBox<Currency> toCurrency;

    public ExchangeDialog(Currency[] currencies) {
        super();
        this.currencies = currencies;
        createWidgets();
    }

    @Override
    public Exchange getExchange() {
        return new Exchange(getMoney(), getToCurrency());
    }

    public Money getMoney() {
        return new Money(getAmount(), getFromCurrency());
    }

    public int getAmount() {
        return 0;
    }

    public Currency getFromCurrency() {
        return fromCurrency.getItemAt(1);
    }

    public Currency getToCurrency() {
        return toCurrency.getItemAt(1);
    }

    private void createWidgets() {
        add(createAmount());
        add(createComboBox());
        add(createToCurrency());
    }

    private JTextField createAmount() {
        this.amount = new JTextField(10);
        return amount;
    }

    private JComboBox<Currency> createComboBox() {
        this.fromCurrency = new JComboBox<>(currencies);
        return fromCurrency;
    }

    private JComboBox<Currency> createToCurrency() {
        this.toCurrency = new JComboBox<>(currencies);
        return toCurrency;
    }

}
