import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Container;
public class Ques14p12 extends JFrame implements ActionListener
{
    private JLabel label = new JLabel("Enter Temperature: ");
    private JTextField text = new JTextField(10);
    private Container box = new Container();
    private Container box1 = new Container();
    private JLabel label1 = new JLabel("Temperature in Celsius: ");
    private JLabel value;
    private JButton button = new JButton("Convert");;
    double celsius;
    int fahren;
    public Ques14p12()
    {
        super("Temperature Conversion");
        value = new JLabel("");
        box.setLayout(new FlowLayout());
        box.add(label);
        box.add(text);
        box.add(button);
        box1.setLayout(new FlowLayout());
        box1.add(label1);
        box1.add(value);
        add(box1, BorderLayout.SOUTH);
        add(box, BorderLayout.CENTER);
        button.addActionListener(this);
        text.addActionListener(this);
        
    }
    public void actionPerformed(ActionEvent event)
    {
        fahren = Integer.parseInt(text.getText()); 
        celsius = (double)5/9 * (fahren-32);
        value.setText(String.format("%.2f", celsius));
    }
}