package ui.swing;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextArea;

class DialogPanel extends JPanel {

    public JTextArea area;

    public DialogPanel() {
        createTools();
    }

    private void createTools() {
        add(createTextArea());
    }

    private JComponent createTextArea() {
        JTextArea area = new JTextArea(1, 20);
        area.setLineWrap(true);
        area.setEditable(false);
        this.area = area;
        return area;
    }

    public JTextArea getArea() {
        return area;
    }

}
