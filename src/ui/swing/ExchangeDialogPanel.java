package ui.swing;

import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.Currency;
import model.Exchange;
import model.Money;
import ui.ExchangeDialog;

public class ExchangeDialogPanel extends JPanel implements ExchangeDialog {

    private final Currency[] currencies;
    private JTextField amount;
    private JComboBox<Currency> fromCurrency;
    private JComboBox<Currency> toCurrency;

    public ExchangeDialogPanel(Currency[] currencies) {
        this.currencies = currencies;
        setLayout(new FlowLayout());
        createToolBar();
    }

    private void createToolBar() {
        add(createAmount());
        add(createFromCurrency());
        add(createToCurrency());
    }

    private JTextField createAmount() {
        JTextField amount = new JTextField(10);
        this.amount = amount;
        return amount;
    }

    private Component createFromCurrency() {
        JComboBox<Currency> fromCurrency = new JComboBox<>(currencies);
        this.fromCurrency = fromCurrency;
        return fromCurrency;
    }

    private Component createToCurrency() {
        JComboBox<Currency> toCurrency = new JComboBox<>(currencies);
        this.toCurrency = toCurrency;
        return toCurrency;
    }

    @Override
    public Exchange getExchange() {
        return new Exchange(getMoney(), getCurrency(toCurrency));
    }

    public Money getMoney() {
        return new Money(getAmount(), getCurrency(fromCurrency));
    }

    public Currency getCurrency(JComboBox<Currency> comboBox) {
        return comboBox.getItemAt(comboBox.getSelectedIndex());
    }

    public double getAmount() {
        return Double.parseDouble(amount.getText());
    }
}
