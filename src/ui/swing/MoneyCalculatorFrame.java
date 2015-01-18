package ui.swing;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import model.Currency;

public class MoneyCalculatorFrame extends JFrame {

    private final Currency[] currencies;
    private DialogPanel area;
    private ActionListener actionListener;
    private ExchangeDialogPanel exchangeDialog;

    public MoneyCalculatorFrame(Currency[] currencies) {
        this.currencies = currencies;
        this.setTitle("Money Calculator");
        this.setMinimumSize(new Dimension(300, 300));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.createWidgets();
        this.setVisible(true);
    }

    public ExchangeDialogPanel getExchangeDialog() {
        return exchangeDialog;
    }

    public void registerActionInCalculateButton(ActionListener actionListener) {
        this.actionListener = actionListener;
    }

    private void createWidgets() {
        exchangeDialog = new ExchangeDialogPanel(currencies);
        add(createTextDialog(), BorderLayout.CENTER);
        add(createExchangeDialog(), BorderLayout.PAGE_START);
        add(createCalculateButton(), BorderLayout.SOUTH);
    }

    private Component createExchangeDialog() {
        ExchangeDialogPanel dialog = new ExchangeDialogPanel(currencies);
        this.exchangeDialog = dialog;
        return dialog;
    }

    private Component createCalculateButton() {
        JButton button = new JButton("Calculate");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actionListener.actionPerformed(e);
            }
        });
        return button;
    }

    private Component createTextDialog() {
        DialogPanel panel = new DialogPanel();
        this.area = panel;
        return panel;
    }

    public DialogPanel getArea() {
        return area;
    }

}
