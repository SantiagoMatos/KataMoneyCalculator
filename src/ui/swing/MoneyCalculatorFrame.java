package ui.swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import model.Currency;
import ui.MoneyDisplay;

public class MoneyCalculatorFrame extends JFrame {

    private final Currency[] currencies;
    private ActionListener actionListener;
    private MoneyDisplay display;
    private ExchangeDialog exchangeDialog;

    public MoneyCalculatorFrame(Currency[] currencies) {
        super();
        this.currencies = currencies;
        this.setTitle("Money Calculator");
        this.setMinimumSize(new Dimension(300, 300));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.createWidgets();
        this.setVisible(true);
    }

    public MoneyDisplay getMoneyDisplay() {
        return display;
    }

    public ExchangeDialog getExchangeDialog() {
        return exchangeDialog;
    }

    public void registerActionInCalculateButton(ActionListener actionListener) {
        this.actionListener = actionListener;
    }

    private void createWidgets() {
        exchangeDialog = new ExchangeDialog(currencies);
        add(exchangeDialog);
        add(createCalculateButton(), BorderLayout.SOUTH);
    }
/*
    private ExchangeDialog createExchangeDialog() {
        exchangeDialog = new ExchangeDialog();
        return exchangeDialog;
    }

    private MoneyDisplay createMoneyDisplay() {
        display = new MoneyDisplay();
        return display;
    }
*/
    private JButton createCalculateButton() {
        JButton button = new JButton("Calculate");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actionListener.actionPerformed(e);
            }
        });
        return button;
    }

}
