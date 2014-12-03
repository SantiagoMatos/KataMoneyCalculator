package swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import model.Currency;

public class MoneyCalculatorFrame extends JFrame {

    private ActionListener actionListener;
    private final Currency[] currencies;
    private ExchangeDialog exchangeDialog;

    public MoneyCalculatorFrame(Currency[] currencies) {
        this.currencies = currencies;
        this.setTitle("Money Calculator");
        this.setMinimumSize(new Dimension(300, 300));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.createWidgets();
        this.setVisible(true);
    }

    public void registerActionInCalculateButton(ActionListener actionListener) {
        this.actionListener = actionListener;
    }

    private void createWidgets() {
        exchangeDialog = new ExchangeDialog(currencies);
        add(exchangeDialog);
        add(createCalculateButton(), BorderLayout.SOUTH);
    }

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

    public ui.ExchangeDialog getExchangeDialog() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
