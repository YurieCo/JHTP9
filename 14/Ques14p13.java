import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.Container;
import java.awt.GridLayout;
public class Ques14p13 extends JFrame implements ActionListener
{
    private JLabel label = new JLabel("Enter Temperature: ");
    private JTextField text = new JTextField(10);
    private Container box = new Container();
    private Container box1 = new Container();
    private JLabel label1 = new JLabel();
    private JLabel value;
    private final static String[] names = {"Celsius >> Fahrenheit", "Celsius >> Kelvin",
        "Kelvin >> Fahrenheit", "Fahrenheit >> Celsius", "Kelvin >> Celsius", "Fahrenheit >> Kelvin"};
    private JComboBox<String>combo = new JComboBox<String>(names);
    private JButton button = new JButton("Convert");
    private JScrollPane scroller = new JScrollPane();
    double convert;
    double textInt;
    public Ques14p13()
    {
        super("Temperature Conversion");
        value = new JLabel();
        box.setLayout(new FlowLayout());
        box.add(label);
        box.add(text);
        add(box);
        scroller.add(combo);
        box.add(combo);
        box.add(button);
        box1.setLayout(new FlowLayout());
        box1.add(label1);
        box1.add(value);
        add(box1, BorderLayout.SOUTH);
        button.addActionListener(this);
        //combo.addActionListener(this);
    }
    public void actionPerformed(ActionEvent event)
    {
        textInt = Double.parseDouble(text.getText());
        if (combo.getSelectedIndex() == 0)
        {
            label1.setText("Temperature in Fahrenheit >> ");
            convert = 32 + (textInt * (double)9/5);
        }
        if (combo.getSelectedIndex() == 1)
        {
            label1.setText("Temperature in Kelvin >> ");
            convert = textInt + 273.15;
        }
        if (combo.getSelectedIndex() == 2)
        {
            label1.setText("Temperature in Fahrenheit >> ");
            convert = 459.67 + (textInt * (double)9/5);
        }
        if (combo.getSelectedIndex() == 3)
        {
            label1.setText("Temperature in Celsius >> ");
            convert = (double)5/9 * (textInt - 32);
        }
        if (combo.getSelectedIndex() == 4)
        {
            label1.setText("Temperature in Celsius >> ");
            convert = textInt - 273.15;
        }
        if (combo.getSelectedIndex() == 5)
        {
            label1.setText("Temperature in Kelvin >> ");
            convert = (double)5/9 * (textInt - 2298.35/9);
        }
        value.setText(String.format(" %.2f", convert));
    }
    /*public void itemStateChanged(ItemEvent event)
    {
        if (combo.getSelectedIndex() == 0)
            convert = 32 + (textInt * (double)9/5);
        if (combo.getSelectedIndex() == 1)
            convert = textInt + 273.15;
        if (combo.getSelectedIndex() == 2)
            convert = 459.67 + (textInt * (double)9/5);
        if (combo.getSelectedIndex() == 3)
            convert = (double)5/9 * (textInt - 32);
        if (combo.getSelectedIndex() == 4)
            convert = textInt - 273.15;
        if (combo.getSelectedIndex() == 5)
            convert = (double)5/9 * (textInt - 2298.35/9);
    }*/
}